import java.io.PrintWriter;
import java.util.List;

public class StudentiInFisierText implements IstudentiExport{
    private String fileName;
    public StudentiInFisierText(String filename){
        this.fileName=filename;
    }
    @Override
    public void doExport(List<Student> studenti){
        try{
            PrintWriter writer= new PrintWriter(fileName);
            for(Student s:studenti){
                writer.println(s);
            }
            writer.close();
            System.out.println("Export txt realizat");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
