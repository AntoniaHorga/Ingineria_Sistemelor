import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MainStudenti5 {

    public static void writeToFile(String filename, Collection<? extends Student> studenti){
        try(java.io.PrintWriter writer=new java.io.PrintWriter(filename)){
            for(Student s:studenti){
                writer.println(s);
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    void main(){
        Set<StudentBursier> bursieri=new HashSet<>();

        bursieri.add(new StudentBursier(1025,"Andrei","Popa","ISM41/2",8.70,725.50));
        bursieri.add(new StudentBursier(1024,"Ioan","Mihalcea","ISM41/1",9.80,801.10));
        bursieri.add(new StudentBursier(1026,"Anamaria","Prodan","TI31/1",8.90,745.50));
        bursieri.add(new StudentBursier(1029,"Bianca","Popescu","TI31/1",9.10,780.80));

        writeToFile("bursieri.out.txt",bursieri);
    }
}
