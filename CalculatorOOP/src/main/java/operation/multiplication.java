package operation;

public class multiplication extends Operator {

    public multiplication(double a, double b) {
        super(a, b);
    }

    @Override
    public double calculate() {
        return a * b;
    }
}
