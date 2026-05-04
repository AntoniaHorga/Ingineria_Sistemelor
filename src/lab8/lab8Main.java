package lab8;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

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

    public static void copyAndAverage(String input,String output){
        try(FileInputStream fis =new FileInputStream(input);
        Workbook workbook=new XSSFWorkbook(fis);
        Workbook outWorkbook=new XSSFWorkbook()){

            Sheet sheet=workbook.getSheetAt(0);
            Sheet outSheet=outWorkbook.createSheet();

            int rowNum=0;

            for(Row row:sheet){

                Row newRow=outSheet.createRow(rowNum);

                int colNum=0;
                int sum=0;

                int lastCol=row.getLastCellNum();

                for(Cell cell:row){
                    Cell newCell=newRow.createCell(colNum);

                    if(cell.getCellType()==CellType.STRING){
                        newCell.setCellValue(cell.getStringCellValue());
                    }

                    if(cell.getCellType()==CellType.NUMERIC){
                        double val=cell.getNumericCellValue();
                        newCell.setCellValue(val);

                        if(colNum>=lastCol-3){
                            sum+=val;
                        }
                    }
                    colNum++;
                }

                double avg=sum/3;
                newRow.createCell(colNum).setCellValue(avg);
                rowNum++;
            }
            FileOutputStream fos=new FileOutputStream(output);
            outWorkbook.write(fos);
            fos.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    void main(){
        readExcel("laborator8_input.xlsx");

        copyAndAverage("laborator8_input.xlsx","laborator8_output2.xlsx");
    }
}
