package org.example;

import java.util.Scanner;

/**
 * Created by GeT on 08.06.25.
 * <p>
 * Edited 10.06.25
 *
 * @author GeT
 */
public class Main {
    /**
     * В данном методе сделаны базовые функции калькулятора с последующим округлением до 4 знаков
     */
    public static void main(String[] args) {
        double result = 0;
        Scanner scanner = new Scanner(System.in);

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
}