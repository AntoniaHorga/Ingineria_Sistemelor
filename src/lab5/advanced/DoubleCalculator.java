package lab5.advanced;

public class DoubleCalculator extends ACalculator{
    public DoubleCalculator(double val){
        this.state=val;
    }

    @Override
    protected void init(){
        state=0.0;
    }

    public DoubleCalculator add(double value){
        double current=(Double)this.state;
        this.state=current+value;
        return this;
    }

    public DoubleCalculator subtract(double val){
        double current=(Double)this.state;
        this.state=current-val;
        return this;
    }

    public DoubleCalculator multiply(double val){
        double current=(Double)this.state;
        this.state=current*val;
        return this;
    }

}
