import operation.*;

import java.util.Scanner;

public class Main {
    /**
     * В случае неверного ввода программа завершает свою работу. наверное, лучше было бы сделать циклом на повторный ввод, но решил оставить так, так как задание на обработку исключений.
     */
    public static void main(String[] args) {

        double num = 0, num2 = 0;
        String op = "";

        try {
            num = Double.parseDouble(input.inp());
            num2 = Double.parseDouble(input.inp());
        }
        catch (Exception e) {
            System.out.println("Please enter a valid number");
            System.exit(0);
        }

        try {
            op = input.inp();
            System.exit(0);
        }
        catch (Exception e) {
            System.out.println("Please enter a valid operation");
        }

        double result = Calculate.calculation(num, num2, op);
        System.out.println(result);
    }
}