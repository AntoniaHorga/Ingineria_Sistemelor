package lab5.advanced;

public class Lab5Adv {
    void main(){
        NewIntCalculator CalculInt=new NewIntCalculator(10);
        int rezultat1=(Integer)CalculInt.add(5).subtract(3).multiply(2).result();
        System.out.println("Calcul int: "+rezultat1);
        System.out.println();
        DoubleCalculator calculDouble=new DoubleCalculator(10);
        double rezultat2=(Double)calculDouble.add(5).subtract(3.3).multiply(2.2).result();
        System.out.println("Calcul doble: "+rezultat2);
    }
}
