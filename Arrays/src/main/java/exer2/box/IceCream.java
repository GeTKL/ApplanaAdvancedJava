package exer2.box;

public class IceCream extends Box {
    private String type;
    public IceCream(String name, Double weight, Double price, String type) {
        super(name, weight, price);
        this.type = type;
    }

    public IceCream(){}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "IceCream + [" + super.toString() + ", type = " + type + "]";
    }
}
