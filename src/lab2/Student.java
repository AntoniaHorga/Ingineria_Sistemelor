package lab2;

public class Student {
    public int numarMatricol;
    public String nume;
    public String prenume;
    public String formatieDeStudiu;

    public Student(int numarMatricol, String prenume, String nume, String formatieDeStudiu){
        this.numarMatricol=numarMatricol;
        this.prenume=prenume;
        this.nume=nume;
        this.formatieDeStudiu=formatieDeStudiu;
    }

    public String toString(){
        return "Student- "+"nr matricol: "+numarMatricol+", nume: "+nume+", prenume: "+prenume+", formatie de studiu: "+formatieDeStudiu+" -";
    }
}
