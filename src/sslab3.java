import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


public class sslab3{
    public static void main(String[] args) throws IOException{
        Path path=Paths.get("src/lab3/Studenti_in.txt");
        List<String>lines=Files.readAllLines(path);

        List<Student>studenti=new ArrayList<>();
        studenti=new LinkedList<>();

        for(String line:lines) {
            String[] parts = line.split(",");

            int nrMatricol = Integer.parseInt(parts[0]);
            String prenume = parts[1];
            String nume = parts[2];
            String grupa = parts[3];

            Student s = new Student(nrMatricol, prenume, nume, grupa);
            studenti.add(s);
        }
        System.out.println("Studenti cititi: \n");
        for(Student s:studenti){
            System.out.println(s);
        }

        Collections.sort(studenti,(s1,s2) -> s1.nume.compareTo(s2.nume));

        Path out=Paths.get("Studenti_out.txt");

        List<String>output=new ArrayList<>();
        for(Student s:studenti){
            output.add(s.toString());
        }
        Files.write(out,output);

        //tema de casa
        Collections.sort(studenti, (s1,s2) -> {
            int cmp = s1.formatieDeStudiu.compareTo(s2.formatieDeStudiu);

            if (cmp == 0) {
                return s1.nume.compareTo(s2.nume);
            }
            return cmp;

        });

        studenti.sort(
                Comparator.comparing(Student::getFormatie).thenComparing(Student::getNume)
        );


        Path out2=Paths.get("studenti_out_sorted.txt");
        List<String>output2=new ArrayList<>();

        for(Student s:studenti){
            output2.add(s.toString());
        }
        Files.write(out2,output2);
    }
}