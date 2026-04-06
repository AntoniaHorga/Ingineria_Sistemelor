import java.util.*;

public class mainLab7 {

    static StudentImutabil schimbaFormatia(StudentImutabil st,String nouaFormatie){
        return new StudentImutabil(
                st.getNumarMatricol(),
                st.getPrenume(),
                st.getNume(),
                nouaFormatie,
                st.getNota()
        );
    }

    static Set<StudentImutabil> imparteInDouaFormatii(Set<StudentImutabil>studenti,String f1,String f2){
        Set<StudentImutabil>rezultat=new LinkedHashSet<>();

        int i=0;
        int size=studenti.size();
        int jumatate=size/2+size%2;

        for(StudentImutabil st: studenti){
            if(i < jumatate){
                rezultat.add(schimbaFormatia(st, f1));
            } else {
                rezultat.add(schimbaFormatia(st, f2));
            }
            i++;
        }
        return rezultat;
    }

    void main(){
        Set<StudentImutabil> studenti2 = new HashSet<>();

        studenti2.add(new StudentImutabil(1024,"Ioan","Mihalcea","ISM41/1",9.8));
        studenti2.add(new StudentImutabil(1025,"Andrei","Popa","ISM41/2",8.7));
        studenti2.add(new StudentImutabil(1026,"Anamaria","Prodan","TI31/1",8.9));
        studenti2.add(new StudentImutabil(1029,"Bianca","Popescu","TI31/1",9.1));

        studenti2=imparteInDouaFormatii(studenti2,"ISM 211/1","ISM 211/2");

        for(StudentImutabil s:studenti2){
            System.out.println(s);
        }
    }
}
