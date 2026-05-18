import java.util.List;

public abstract class ExportDecorator implements IstudentiExport{
    protected IstudentiExport export;
    public ExportDecorator(IstudentiExport export){
        this.export=export;
    }
    @Override
    public void doExport(List<Student> studenti){
        export.doExport(studenti);
    }
}
