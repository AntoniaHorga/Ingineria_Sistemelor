import java.util.List;

public class Exporter {
    public void startExport(
            IstudentiExport strategy,
            List<Student> studenti){
        strategy.doExport(studenti);
    }
}
