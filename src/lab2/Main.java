package lab2;

import java.util.*;

public class Main {
    void main() {

        //2.5.1

        List<Integer> x = new ArrayList();
        List<Integer> y = new ArrayList();
        List<Integer> xPlusY = new ArrayList(); //a
        Set<Integer> zSet = new TreeSet(); //b
        List<Integer> xMinusY = new ArrayList();//c
        int p = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList();

        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            x.add(rand.nextInt(11));
        }

        for (int i = 0; i < 7; i++) {
            y.add(rand.nextInt(11));
        }

        Collections.sort(x);
        Collections.sort(y);

        System.out.println("x= " + x);
        System.out.println("y= " + y);

        //a

        xPlusY.addAll(x);
        xPlusY.addAll(y);
        Collections.sort(xPlusY);
        System.out.println("x plus y= " + xPlusY);

        //b

        zSet.addAll(x);
        zSet.retainAll(y);
        System.out.println("z= " + zSet);

        //c

        xMinusY.addAll(x);
        xMinusY.removeAll(y);
        System.out.println("x minus y= " + xMinusY);

        //d

        for (Integer val : x) {
            if (val <= p) {
                xPlusYLimitedByP.add(val);
            }
        }

        for (Integer val : y) {
            if (val <= p) {
                xPlusYLimitedByP.add(val);
            }
        }

        Collections.sort(xPlusYLimitedByP);
        System.out.println("x plus y mai mic decat 4: " + xPlusYLimitedByP);
    }
}



