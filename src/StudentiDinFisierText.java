import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class StudentiDinFisierText
        implements IstudentiImport {

    private String fileName;

    public StudentiDinFisierText(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<Student> doImport() {

        List<Student> studenti =
                new ArrayList<>();

        try {

            BufferedReader br =
                    new BufferedReader(
                            new FileReader(fileName));

            String line;

            while((line = br.readLine()) != null) {

                String[] parts =
                        line.split(" ");

                int id =
                        Integer.parseInt(parts[0]);

                String nume = parts[1];
                String prenume = parts[2];
                String grupa = parts[3];

                double medie =
                        Double.parseDouble(parts[4]);

                Student s =
                        new Student(id,nume,
                                prenume,grupa,medie);

                studenti.add(s);
            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return studenti;
    }
}