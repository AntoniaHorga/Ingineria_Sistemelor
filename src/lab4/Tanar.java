package lab4;

public class Tanar {
    private String name;
    private int age;
    private String address;

    Tanar(String name,int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }
    public String ToString(){
        return "Tanar- nume: "+name+", varsta: "+age+", adresa: "+address+" -";
    }
}
