import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class StudentiDinFisierXlsx
        implements IstudentiImport {

    private String fileName;

    public StudentiDinFisierXlsx(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<Student> doImport() {

        List<Student> studenti =
                new ArrayList<>();

        try {

            FileInputStream fis =
                    new FileInputStream(fileName);

            XSSFWorkbook workbook =
                    new XSSFWorkbook(fis);

            XSSFSheet sheet =
                    workbook.getSheetAt(0);

            for(Row row : sheet) {

                int id =
                        (int) row.getCell(0)
                                .getNumericCellValue();

                String nume =
                        row.getCell(1)
                                .getStringCellValue();

                String prenume =
                        row.getCell(2)
                                .getStringCellValue();

                String grupa =
                        row.getCell(3)
                                .getStringCellValue();

                double medie =
                        row.getCell(4)
                                .getNumericCellValue();

                Student s =
                        new Student(id,nume,
                                prenume,grupa,medie);

                studenti.add(s);
            }

            workbook.close();
            fis.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return studenti;
    }
}
