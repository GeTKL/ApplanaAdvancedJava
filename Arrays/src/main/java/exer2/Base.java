package exer2;

import exer2.box.Box;
import exer2.box.Candy;
import exer2.box.Doughnut;
import exer2.box.IceCream;

/**
 * @Author GeT
 * <p>Основной метод, сюда ввод идет для обычного конструктора и пустого конструктора (iceCream2 в пустой конструктор).</p>
 * В цикле идет получение значения для каждого элемента в массиве (цены и веса) и сложение их для общего вывода
 */
public class Base {
    public static void boxArray() {
        double sum = 0;
        double weight = 0;
        Candy candy1 = new Candy("Shipuchka", 27.5, 120.0, false);
        Doughnut doughnut1 = new Doughnut("BananaSmuzi", 80.2, 129.99, "Banana");

        IceCream iceCream1 = new IceCream("Korovka", 100.2, 99.99, "Plombir");
        IceCream iceCream2 = new IceCream();
        iceCream2.setName("Lipetskoe");
        iceCream2.setWeight(50.5);
        iceCream2.setPrice(69.99);
        iceCream2.setType("Eskimo");

        Box [] staff = {candy1, doughnut1, iceCream1, iceCream2};
        for (Box someBox: staff) {
            sum += someBox.getPrice();
            weight += someBox.getWeight();
            System.out.println(someBox.toString());
        }
        System.out.println("Total price gift = " + sum + "\nTotal weight gift = " + weight);
    }
}
