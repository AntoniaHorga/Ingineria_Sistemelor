package lab8;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class lab8Main {

    public static void readExcel(String fileName) {
        try (FileInputStream fis = new FileInputStream(fileName);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                for (Cell cell : row) {

                    String value="";
                    switch (cell.getCellType()) {
                        case STRING:
                            value=cell.getStringCellValue();
                            break;
                        case NUMERIC:
                            value=String.valueOf(cell.getNumericCellValue());
                            break;
                        default:
                            value="";
                    }
                    System.out.printf("%-15s",value);
                }
                System.out.println();
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    void main(){
        readExcel("laborator8_input.xlsx");
    }
}
