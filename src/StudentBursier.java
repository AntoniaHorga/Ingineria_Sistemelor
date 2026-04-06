public class StudentBursier extends Student{
    private double cuantumBursa;

    public StudentBursier(int numarMatricol,String prenume,String nume,String formatieDeStudiu,double nota,double cuantumBursa){
        super(numarMatricol,prenume,nume,formatieDeStudiu);
        this.nota=nota;
        this.cuantumBursa=cuantumBursa;
    }

    @Override
    public boolean equals(Object o){
        if(this==o)return true;
        if(!(o instanceof StudentBursier))return false;

        StudentBursier that=(StudentBursier) o;

        return this.numarMatricol==that.numarMatricol;
    }

    @Override
    public int hashCode(){
        return Integer.hashCode(numarMatricol);
    }

    @Override
    public String toString(){
        return super.toString()+" bursa: "+cuantumBursa;
    }

}
