package operation;

public class substraction extends Operator {

    public substraction(double a, double b) {
        super(a, b);
    }

    @Override
    public double calculate() {
        return a - b;
    }
}
