package exer2.box;

/**
 * Класс, который наследуется другими для последующего вывода информации о подарке
 */
public abstract class Box {
    private String name;
    private Double weight;
    private Double price;

    public Box(){}

    /**
     * @param name Обязательный параметр - Название
     * @param weight Обязательный параметр - Вес
     * @param price Обязателный параметр - цена
     */
    public Box(String name, Double weight, Double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    /**
     * @return Метод, который выводит информацию в базовом виде, возможна перезапись
     */
    @Override
    public String toString() {
        return  "name = '" + name + '\'' +
                ", weight = " + weight +
                ", price = " + price;
    }
}
