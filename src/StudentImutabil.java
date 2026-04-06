import java.util.Objects;

public final class StudentImutabil {
    private final int numarMatricol;
    private final String nume;
    private final String prenume;
    private final String formatieDeStudiu;
    private final double nota;

    public StudentImutabil(int numarMatricol,String prenume,String nume,String formatieDeStudiu,double nota){
        this.numarMatricol=numarMatricol;
        this.prenume=prenume;
        this.nume=nume;
        this.formatieDeStudiu=formatieDeStudiu;
        this.nota=nota;
    }

    public int getNumarMatricol(){
        return numarMatricol;
    }

    public String getNume(){
        return nume;
    }

    public String getPrenume(){
        return prenume;
    }

    public String getFormatieDeStudiu(){
        return formatieDeStudiu;
    }

    public double getNota(){
        return nota;
    }

    @Override
    public String toString(){
        return "Student- nr matricol: "+numarMatricol+
                ", nume: "+nume+
                ", prenume: "+prenume+
                ", formatie: "+formatieDeStudiu+
                ", nota: "+nota;
    }

    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(o==null || getClass()!=o.getClass()) return false;
        StudentImutabil student=(StudentImutabil) o;
        return numarMatricol==student.numarMatricol;
    }

    @Override
    public int hashCode(){
        return Objects.hash(numarMatricol);
    }


}
