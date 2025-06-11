package org.example;

/**
 * Перегрузка методов - это, когда один метод имеет одно действие. но имеет разные действия с другой сигнатурой и другими функциями в нем
 */
public class Reboot {
    public static void print() {
        System.out.println("");
    }

    public static void print(int i){
        System.out.println(i);
    }

    public static void print(String text){
        System.out.println(text);
    }

    public static void main(String[] args) {
        print();
        print(1);
        print("Hello");

        System.out.println(sum());
        System.out.println(sum(1.0));
        System.out.println(sum(1.0,2.0));
        System.out.println(sum(1.0,2.0,3.0));
    }


    /**
     * Может быть void, если ничего не возвращаем
     * @param values Троеточие означает, что мы можем указать сколько угодно в него параметров
     * @return Возвращает сумму переданных значений
     */
    public static double sum(double... values){
        double sum = 0.0;
        for (double v : values) {
            sum += v;
        }
        return sum;
    }
}
