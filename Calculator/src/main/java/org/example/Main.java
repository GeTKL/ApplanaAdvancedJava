package org.example;
import java.util.Scanner;

/**
 * Created by GeT on 08.06.25.
 * <p>
 * Edited 10.06.25
 * @author GeT
 */
public class Main {
    /**
     * Главный метод позволяет запустить 2 разные программы. Калькулятор и нахождение самого длинного слова в массиве
     */
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter task: 1 - calculator, 2 - string array");
        int select = scanner.nextInt();

        if (select == 1) {
            calc();
        }
        else if (select == 2) {
            stringArray();
        }
        else System.out.println("Invalid selection");
    }

    /**
     * В данном методе сделаны базовые функции калькулятора с последующим округлением до 4 знаков
     */
    public static void calc(){
        double result = 0;

        System.out.println("Enter first digits");
        double firstDigit = scanner.nextDouble();

        System.out.println("Enter second digits");
        double secondDigit = scanner.nextDouble();

        System.out.println("Enter sign");
        String sign = scanner.next();

        scanner.close();

        switch (sign) {
            case "+":
                result = firstDigit + secondDigit;
                break;
            case "-":
                result = firstDigit - secondDigit;
                break;
            case "*":
                result = firstDigit * secondDigit;
                break;
            case "/":
                result = firstDigit / secondDigit;
                break;
            default:
                System.out.println("Invalid sign");
        }

        System.out.printf("%.4f", result);
    }

    /**
     * В этом методе выводится самое длинное слово в массиве.
     * <p>
     * Можно улучшить, добавив, что, если 2 слова одной длинны или более, то вывод всех слов. Думаю через вывод циклом обычным print
     */
    public static void stringArray(){
        int quant_letters;
        int result = 0;
        int number = 0;
        System.out.println("Enter quantity elements array");
        int quantity = scanner.nextInt();

        String[] array = new String[quantity];
        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter element " + (i + 1) + " :");
            array[i] = scanner.next();
            quant_letters = array[i].length();
            if (quant_letters > result) {
                result = quant_letters;
                number = i;
            }
        }
        scanner.close();
        System.out.println(array[number]);
    }
}