package exer2.box;

public class Candy extends Box {
    private boolean stickiness;

    public Candy(String name, Double weight, Double price, boolean stickiness) {
        super(name, weight, price);
        this.stickiness = stickiness;
    }

    public boolean isStickiness() {
        return stickiness;
    }

    public void setStickiness(boolean stickiness) {
        this.stickiness = stickiness;
    }

    @Override
    public String toString() {
        return "Candy + [" + super.toString() + ", stickiness = " + stickiness + "]";
    }
}
