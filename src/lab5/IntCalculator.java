package lab5;

public class IntCalculator {
    int state;

    public IntCalculator(){}

    public IntCalculator(int initialValue){
        this.state=initialValue;
    }

    public IntCalculator add(int val){
        this.state+=val;
        return this;
    }

    public IntCalculator subtract(int val){
        this.state-=val;
        return this;
    }

    public IntCalculator multiply(int val){
        this.state*=val;
        return this;
    }

    public int result(){
        return this.state;
    }

    public IntCalculator clear(){
        this.state=0;
        return this;
    }
}
