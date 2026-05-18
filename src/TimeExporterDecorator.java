import java.util.List;

public class TimeExporterDecorator extends ExportDecorator{
    public TimeExporterDecorator(IstudentiExport export){
        super(export);
    }
    @Override
    public void doExport(List<Student> studenti){
        long start=System.currentTimeMillis();
        export.doExport(studenti);
        long end=System.currentTimeMillis();
        System.out.println("Timp de executie: "+(end-start)+" ms");
    }
}
