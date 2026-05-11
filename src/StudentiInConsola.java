import java.util.List;

public class StudentiInConsola implements IstudentiExport{
    @Override
    public void doExport(List<Student> studenti){
        for(Student s:studenti){
            System.out.println(s);
        }
    }
}
