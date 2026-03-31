package lab5;

public class AppLab5 {
    void main(){
       IntCalculator calculator=new IntCalculator(10);
       int result=calculator.add(5).subtract(3).multiply(2).result();
       System.out.println("Rezultat a: "+result);
        System.out.println();
       AdvancedCalculator adv=new AdvancedCalculator(10);
       int result2=adv.add(5).subtract(3).multiply(2).divide(4).power(2).root(2).result();
       System.out.println("Rezultat b: "+result2);


    }
}
