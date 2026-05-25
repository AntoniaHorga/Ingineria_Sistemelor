import java.io.FileOutputStream;
import java.util.List;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class StudentiInFisierXlsx implements IstudentiExport {
    private String fileName;
    public StudentiInFisierXlsx(String fileName) {
        this.fileName = fileName;
    }
    @Override
    public void doExport(List<Student> studenti){
        try {

            XSSFWorkbook workbook =
                    new XSSFWorkbook();

            XSSFSheet sheet =
                    workbook.createSheet("Studenti");

            int rowIndex = 0;

            for(Student s : studenti) {

                Row row = sheet.createRow(rowIndex++);

                row.createCell(0)
                        .setCellValue(s.getNumarMatricol());

                row.createCell(1)
                        .setCellValue(s.getNume());

                row.createCell(2)
                        .setCellValue(s.getPrenume());

                row.createCell(3)
                        .setCellValue(s.getFormatie());

                row.createCell(4)
                        .setCellValue(s.getNota());
            }

            FileOutputStream fos =
                    new FileOutputStream(fileName);

            workbook.write(fos);

            fos.close();
            workbook.close();

            System.out.println("Export XLSX realizat!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
