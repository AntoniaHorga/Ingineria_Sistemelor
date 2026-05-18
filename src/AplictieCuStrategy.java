import java.util.Arrays;
import java.util.List;

public class AplictieCuStrategy {
    void main(){
        List<Student> studenti = Arrays.asList(
                new Student(1025,"Andrei","Popa","ISM141/2", 8.70),
                new Student(1024,"Ioan","Mihalcea","ISM141/1", 10),
                new Student(1026,"Anamaria","Prodan","TI131/1", 8.90),
                new Student(1029,"Bianca","Popescu","TI131/1,", 10),
                new Student(1029,"Maria","Pana","TI131/2,", 4.10),
                new Student(1029,"Gabriela","Mohanu","TI131/2,", 7.33),
                new Student(1029,"Marius","Nasta","TI131/2,", 3.20),
                new Student(1029,"Marius","Nasta","TI131/1,", 5.12),
                new Student(1029,"Andrei","Dobrescu","TI131/2,", 2.22)
        );

        Exporter exporter=new Exporter();

        //a: consola
        IstudentiExport strategyConsola=new StudentiInConsola();
        exporter.startExport(strategyConsola,studenti);

        //b: txt
        IstudentiExport strategyTxt=new StudentiInFisierText("studenti.txt");
        exporter.startExport(strategyTxt,studenti);

        //c: xlsx
        IstudentiExport strategyExcel =
                new StudentiInFisierXlsx(
                        "studenti.xlsx");

        exporter.startExport(
                strategyExcel,
                studenti);


        IstudentiImport importTxt =
                new StudentiDinFisierText(
                        "studenti.txt");

        List<Student> lista =
                importTxt.doImport();

        for(Student s : lista) {
            System.out.println(s);
        }

        IstudentiExport strategyConsola2 =
                new TimeExporterDecorator(
                        new StudentiInConsola());

        exporter.startExport(strategyConsola2, studenti);

        IstudentiExport strategyTxt2 =
                new TimeExporterDecorator(
                        new StudentiInFisierText("studenti.txt"));

        exporter.startExport(strategyTxt2, studenti);
    }
}
