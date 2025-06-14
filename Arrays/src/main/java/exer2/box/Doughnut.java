package exer2.box;

public class Doughnut extends Box {
    private String filling;

    public Doughnut(String name, Double weight, Double price, String filling) {
        super(name, weight, price);
        this.filling = filling;
    }
    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    @Override
    public String toString() {
        return "Doughnut + [" + super.toString() + ", filling = " + this.filling + "]";
    }
}
