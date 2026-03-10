public class Student {
    int numarMatricol;
    String nume;
    String prenume;
    String formatieDeStudiu;

    public Student(int numarMatricol, String nume, String prenume, String formatieDeStudiu){
        this.numarMatricol=numarMatricol;
        this.nume=nume;
        this.prenume=prenume;
        this.formatieDeStudiu=formatieDeStudiu;
    }

    public String toString(){
        return "Student- "+"nr matricol: "+numarMatricol+", nume: "+nume+", prenume: "+prenume+", formatie de studiu: "+formatieDeStudiu+" -";
    }
}
