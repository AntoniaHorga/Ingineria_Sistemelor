package lab4;
import java.util.HashMap;
import java.util.Map;
public class AppLab4 {
    void main(){
        HashMap<String, Integer> varste = new HashMap<>();
        varste.put("Ioan", 21);
        varste.put("Maria", 22);
        varste.put("Victor", 20);
        varste.put("Simina", 20);
        varste.put("Marius", 21);
        varste.put("Mihai", 21);
        varste.put("Daniela", 23);
        Map<String, String> adrese = Map.of(
                "Ioan", "Sibiu",
                "Maria", "Bucuresti",
                "Victor","Cluj",
                "Simina", "Alba-Iulia",
                "Marius", "Medias",
                "Mihai", "Cisnadie",
                "Daniela", "Sibiu");

        System.out.println("Varste: ");
        System.out.println(varste);
        System.out.println();

        varste.put("Vlad",19);
        varste.put("Iulia",19);

        System.out.println("Varsste actualizat: ");
        System.out.println(varste);

        HashMap<String, Tanar> tineri=new HashMap<>();
        for(String nume: varste.keySet()) {
            int varsta = varste.get(nume);

            String adresa = adrese.getOrDefault(nume, "necunoscuta");

            Tanar t=new Tanar(nume,varsta,adresa);
            tineri.put(nume,t);
        }
        System.out.println("Tineri: \n");
        for(String key:tineri.keySet()){
            System.out.println(tineri.get(key));
        }
    }
}
