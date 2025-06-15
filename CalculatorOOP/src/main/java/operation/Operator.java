package operation;

public abstract class Operator {
    public double a;
    public double b;


    public Operator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public abstract double calculate();
}
