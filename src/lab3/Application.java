package lab3;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Application {
    void main() throws IOException {
//adaugare text in lista
        Path path=Paths.get("in.txt");
        List<String>lines=Files.readAllLines(path);

        List<String>rezultatA=new ArrayList<>();
        List<String>rezultatB=new ArrayList<>();

        for(String line:lines){
            rezultatA.add(line+"\n");
            String[] parts=line.split("\\.");

            for(String p:parts){
                rezultatB.add(p.trim()+".\n");
            }
        }

        System.out.println("a: \n");
        for(String s:rezultatA){
            System.out.println(s);
        }

        System.out.println("b: \n");
        for(String s:rezultatB){
            System.out.println(s);
        }

        Path out=Paths.get("out.txt");
        List<String>Output=new ArrayList<>();
        Output.add("a: \n");
        Output.addAll(rezultatA);
        Output.add("b: \n");
        Output.addAll(rezultatB);

        Files.write(out,Output);


    }
}
