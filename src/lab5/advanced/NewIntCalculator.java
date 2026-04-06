package lab5.advanced;

public class NewIntCalculator extends ACalculator{
    public NewIntCalculator(int val){
        this.state=val;
    }

    @Override
    protected void init(){
        this.state=0;
    }

    public NewIntCalculator add(int value){
        int current=(Integer)this.state;
        this.state=current+value;
        return this;
    }

    public NewIntCalculator subtract(int val){
        int current=(Integer)this.state;
        this.state=current-val;
        return this;
    }

    public NewIntCalculator multiply(int val){
        int current=(Integer)this.state;
        this.state=current*val;
        return this;
    }
}
