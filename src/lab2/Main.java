import lab2.Student;

public static boolean CautaStudent(List<Student>lista,Student cautat) {
    for (Student s : lista) {
        if (s.nume.equals(cautat.nume) &&
                s.prenume.equals(cautat.prenume) &&
                s.formatieDeStudiu.equals(cautat.formatieDeStudiu)) {
            return true;
        }
    }
    return false;
}

void main() {
    //Student s1 = new Student(580, "Horga", "Antonia", "ISM");
    //System.out.println(s1);

    //2.5.1

    List<Integer> x = new ArrayList();
    List<Integer> y = new ArrayList();
    List<Integer> xPlusY = new ArrayList(); //a
    Set<Integer> zSet = new TreeSet(); //b
    List<Integer> xMinusY = new ArrayList();//c
    int p = 4;
    List<Integer> xPlusYLimitedByP = new ArrayList();

    Random rand=new Random();

    for(int i=0;i<5;i++)
    {
        x.add(rand.nextInt(11));
    }

    for(int i=0;i<7;i++)
    {
        y.add(rand.nextInt(11));
    }

    Collections.sort(x);
    Collections.sort(y);

    System.out.println("x= "+x);
    System.out.println("y= "+y);

    //a

    xPlusY.addAll(x);
    xPlusY.addAll(y);
    Collections.sort(xPlusY);
    System.out.println("x plus y= "+xPlusY);

    //b

    zSet.addAll(x);
    zSet.retainAll(y);
    System.out.println("z= "+zSet);

    //c

    xMinusY.addAll(x);
    xMinusY.removeAll(y);
    System.out.println("x minus y= "+xMinusY);

    //d

    for(Integer val:x){
        if(val<=p){
            xPlusYLimitedByP.add(val);
        }
    }

    for(Integer val:y){
        if(val<=p){
            xPlusYLimitedByP.add(val);
        }
    }

    Collections.sort(xPlusYLimitedByP);
    System.out.println("x plus y mai mic decat 4: "+ xPlusYLimitedByP);

    //2.5.2

    List <Student> studenti=new ArrayList<>();
    studenti.add(new Student(120,"Alis","Popa","TI21/2"));
    studenti.add(new Student(112,"Maria","Popa","TI21/1"));
    studenti.add(new Student(115,"Antonia","Horga","ISM"));

    System.out.println("Lista de studenti: ");
    for(Student s:studenti){
        System.out.println(s);
    }

    System.out.println();

    Student s1=new Student(120,"Alis","Popa","TI21/2");
    Student s2=new Student(112,"Maria","Popa","TI21/1");

    if(CautaStudent(studenti,s1)) {
        System.out.println("Studenta Alis exista.");
    }
    else{
        System.out.println("Studenta Alis nu exista. ");
    }

    System.out.println();

    if(CautaStudent(studenti,s2)) {
        System.out.println("Studenta Maria exista.");
    }
    else{
        System.out.println("Studenta Maria nu exista. ");
    }

    System.out.println();

    //tema


}
