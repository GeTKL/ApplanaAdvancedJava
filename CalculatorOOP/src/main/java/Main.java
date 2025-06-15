import operation.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double num, num2;
        String op;
        num = Double.parseDouble(input.inp());
        num2 = Double.parseDouble(input.inp());
        op = input.inp();
        double result = Calculate.calculation(num, num2, op);
        System.out.println(result);
    }
}