import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

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

    public static void writeToXls(List<Student> students, String fileName) {
        try (Workbook workbook = new XSSFWorkbook()) {

            Sheet sheet = workbook.createSheet();
            int rowNum = 0;

            for (Student s : students) {
                Row row = sheet.createRow(rowNum++);

                row.createCell(0).setCellValue(s.getNumarMatricol());
                row.createCell(1).setCellValue(s.getNume());
                row.createCell(2).setCellValue(s.getPrenume());
                row.createCell(3).setCellValue(s.getFormatie());
                row.createCell(4).setCellValue(s.getNota());
            }

            FileOutputStream fos = new FileOutputStream(fileName);
            workbook.write(fos);
            fos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readFromXls(String fileName) {
        List<Student> list = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(fileName);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                int nrMatricol = (int) row.getCell(0).getNumericCellValue();
                String prenume = row.getCell(1).getStringCellValue();
                String nume = row.getCell(2).getStringCellValue();
                String formatie = row.getCell(3).getStringCellValue();
                double nota = (double) row.getCell(4).getNumericCellValue();

                list.add(new Student(nrMatricol,prenume,nume,formatie,nota));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    void main(){
        readExcel("laborator8_input.xlsx");

        copyAndAverage("laborator8_input.xlsx","laborator8_output2.xlsx");

        List<Student> studenti=new ArrayList<>();
        studenti.add(new Student(1024,"Ioan","Mihalcea","ISM41/1",9.8));
        studenti.add(new Student(1025,"Andrei","Popa","ISM41/2",8.7));
        studenti.add(new Student(1026,"Anamaria","Prodan","TI31/1",8.9));
        studenti.add(new Student(1029,"Bianca","Popescu","TI31/1",9.1));
        writeToXls(studenti,"lab8_studenti.out.xlsx");

        readFromXls("lab8_studenti.out.xlsx");

    }
}
