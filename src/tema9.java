import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class tema9 {
    void main(){
        List<Student> studentiCuNote = Arrays.asList(
                new Student(1025,"Andrei","Popa","ISM141/2", 8.70),
                new Student(1024,"Ioan","Mihalcea","ISM141/1", 10),
                new Student(1026,"Anamaria","Prodan","TI131/1", 8.90),
                new Student(1029,"Bianca","Popescu","TI131/1", 10),
                new Student(1030,"Maria","Pana","TI131/2", 4.10),
                new Student(1031,"Gabriela","Mohanu","TI131/2", 7.33),
                new Student(1032,"Marius","Nasta","TI131/2", 3.20),
                new Student(1033,"Marius","Nasta","TI131/1", 5.12),
                new Student(1034,"Andrei","Dobrescu","TI131/2", 2.22)
        );
        //a
        List<Student>studentiDe10=studentiCuNote.stream()
                .filter(student->student.getNota()==10)
                .collect(Collectors.toList());
        System.out.println("Studenti cu nota 10: ");
        studentiDe10.forEach(System.out::println);
        //b
        List<Student>sub5=studentiCuNote.stream()
                .filter(student->student.getNota()<5)
                .collect(Collectors.toList());
        System.out.println("Studenti cu nota sub 5: ");
        sub5.forEach(System.out::println);
        //c
        List<Student>studentiModificati=studentiCuNote.stream()
                .map(student->{
                    if(student.getNota()<4){
                        return new Student(
                                (int) student.getNumarMatricol(),
                                student.getNume(),
                                student.getPrenume(),
                                student.getFormatie(),
                                4.0
                        );
                    }
                    return student;
                })
                .collect(Collectors.toList());
        System.out.println("Studenti modificati: ");
        for (Student student : studentiModificati) {
            System.out.println(student);
        }
        //d
        double suma=studentiCuNote.stream()
                .map(student->student.getNota())
                .reduce(0.0,(a,b)->a+b);
        System.out.println("suma notelor: "+suma);
        //e
        double medie=studentiCuNote.stream()
                .mapToDouble(student->student.getNota())
                .average()
                .getAsDouble();
        System.out.println("Media: "+medie);

    }
}
