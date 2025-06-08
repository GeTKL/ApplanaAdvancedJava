package org.example;

import java.util.Scanner;

/**
 * Created by GeT on 08.06.25.
 *
 * @author GeT
 */
public class Main {
    /**
     * В данном методе складываются два дробных числа, полученных через ввод, после чего округляет их
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first digits");
        double firstDigit = scanner.nextDouble();

        System.out.println("Enter second digits");
        double secondDigit = scanner.nextDouble();

        double result = firstDigit + secondDigit;
        System.out.printf("%.4f", result);
    }
}