import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainStudenti4 {

    public static float gasesteNota(String prenume,String nume, HashMap<Integer,Student>studenti) {
        HashMap<String, Student> map2 = new HashMap<>();

        for (Student s : studenti.values()) {
            String cheie = s.prenume + "-" + s.nume;
            map2.put(cheie, s);
        }
            String cautat = prenume + "-" + nume;
            if (map2.containsKey(cautat)) {
                return (float) map2.get(cautat).nota;
            }

        return 0.0f;
    }

    void main(){
        HashMap<Integer,Student>studenti=new HashMap<>();
        try(BufferedReader br=new BufferedReader(new FileReader("studenti_in.txt"))) {
            String linie;
            while ((linie = br.readLine()) != null) {
                String[] parts = linie.split(",");

                int nrMatricol = Integer.parseInt(parts[0]);
                String prenume=parts[1];
                String nume=parts[2];
                String formatie=parts[3];

                Student s=new Student(nrMatricol,prenume,nume,formatie);
                studenti.put(nrMatricol,s);

            }
        }
            catch(IOException e){
                e.printStackTrace();
            }

        try(BufferedReader br=new BufferedReader(new FileReader("note_anon.txt"))) {
            String linie;

            while ((linie = br.readLine()) != null) {
                String[] parts = linie.split(",");

                int nrMatricol = Integer.parseInt(parts[0]);
                double nota = Double.parseDouble(parts[1]);

                if (studenti.containsKey(nrMatricol)) {
                    studenti.get(nrMatricol).setNota(nota);
                }
            }

        } catch(IOException e){
            e.printStackTrace();
        }

        for(Student s:studenti.values()){
            System.out.println(s);
        }

        System.out.println();

        float notaM=gasesteNota("Bianca","Popescu",studenti);
        float notaN=gasesteNota("Ioan","Mihalcea",studenti);

        System.out.println("nota Bainca: "+notaM);
        System.out.println("Nota Ioan: "+notaN);
    }
}

