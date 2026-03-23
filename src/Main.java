/*public static boolean CautaStudent(List<Student>lista,Student cautat) {
    for (Student s : lista) {
        if (s.nume.equals(cautat.nume) &&
                s.prenume.equals(cautat.prenume) &&
                s.formatieDeStudiu.equals(cautat.formatieDeStudiu)) {
            return true;
        }
    }
    return false;
}*/
//Student s1 = new Student(580, "Horga", "Antonia", "ISM");
//System.out.println(s1);

public static void main(){
//2.5.2

    /*List <Student> studenti=new ArrayList<>();
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
*/
//tema

Set<Student>studenti=new HashSet<>();
            studenti.add(new Student(120,"Alis","Popa","TI21/2"));
        studenti.add(new Student(112,"Maria","Popa","TI21/1"));
        studenti.add(new Student(115,"Antonia","Horga","ISM"));

Student s1=new Student(120,"Alis","Popa","TI21/2");
Student s2=new Student(112,"Maria","Popa","TI21/1");

            System.out.println("Studenta Alis s1 a fost gasita? "+studenti.contains(s1));

        System.out.println("Studenta Maria a fost gasita? "+studenti.contains(s2));

        System.out.println(s1.hashCode());
}



