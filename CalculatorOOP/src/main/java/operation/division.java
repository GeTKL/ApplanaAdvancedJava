package operation;

public class division extends Operator{

    public division(double a, double b) {
        super(a, b);
    }

    @Override
    public double calculate() {
        return a / b;
    }
}
