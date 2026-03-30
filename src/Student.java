import java.util.Objects;

public class Student {
    public int numarMatricol;
    public String nume;
    public String prenume;
    public String formatieDeStudiu;
    public double nota;

    public Student(int numarMatricol, String prenume, String nume, String formatieDeStudiu){
        this.numarMatricol=numarMatricol;
        this.prenume=prenume;
        this.nume=nume;
        this.formatieDeStudiu=formatieDeStudiu;
    }

    public void setNota(double nota){
        this.nota=nota;
    }

    public String getNume() {
        return this.nume;
    }

    public String toString(){
        return "Student- "+"nr matricol: "+numarMatricol+", nume: "+nume+", prenume: "+prenume+", formatie de studiu: "+formatieDeStudiu+", nota: "+nota +" -";
    }

    /*public boolean equals(Object o){
        if(this==o) return true;
        if(o==null || getClass()!=o.getClass()) return false;
        Student student=(Student) o;
        return Objects.equals(numarMatricol,student.numarMatricol)&&
                Objects.equals(prenume,student.prenume)&&
                Objects.equals(nume,student.nume)&&
                Objects.equals(formatieDeStudiu,student.formatieDeStudiu);
    }*/

    public boolean equals(Object o){
        if(this==o) return false;
        if(o==null || getClass()!=o.getClass()) return false;
        Student student = (Student) o;
        return numarMatricol == student.numarMatricol;
    }

    public int hashCode(){

        //return Objects.hash(numarMatricol,prenume,nume,formatieDeStudiu);
        return Objects.hash(numarMatricol);
    }

    public String getFormatie() {

        return this.formatieDeStudiu;
    }
}
