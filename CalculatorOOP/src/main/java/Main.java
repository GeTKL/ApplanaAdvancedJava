import operation.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double num, num2;
        String op;
        num = Double.parseDouble(input.inp());
        num2 = Double.parseDouble(input.inp());
        op = input.inp();

        Operator operation;
        
        switch (op) {
            case "+":
                operation = new Addition(num, num2);
                break;
            case "-":
                operation = new substraction(num, num2);
                break;
            case "*":
                operation = new multiplication(num, num2);
                break;
            case "/":
                operation = new division(num, num2);
                break;
            default:
                System.out.println("Неизвестная операция");
                return;
        }

        double result = operation.calculate();
        System.out.println(result);
    }
}