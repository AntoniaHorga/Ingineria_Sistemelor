package lab5;

public class AdvancedCalculator extends IntCalculator {
    public AdvancedCalculator(int initialValue) {
        super(initialValue);
    }

    @Override
    public AdvancedCalculator add(int val) {
        super.add(val);
        return this;
    }

    @Override
    public AdvancedCalculator subtract(int val) {
        super.subtract(val);
        return this;
    }

    @Override
    public AdvancedCalculator multiply(int val) {
        super.multiply(val);
        return this;
    }

    public AdvancedCalculator divide(int val) {
        if (val == 0) {
            throw new ArithmeticException("Impartire la 0");
        }
        int current = this.result();
        this.clear().add(current / val);
        return this;
    }

    public AdvancedCalculator power(int exponent) {
        int current = this.result();
        int result = 1;

        for (int i = 0; i < exponent; i++) {
            result *= current;
        }
        this.clear().add(result);
        return this;
    }

    public AdvancedCalculator root(int n) {
        if (n == 0) {
            throw new ArithmeticException("Radical invalid");
        }
        int current=this.result();
        int result=(int) Math.pow(current,1.0/n);
        this.clear().add(result);
        return this;
    }
}

