import operation.*;

public class Calculate {
    public static double calculation(double num, double num2, String operator) {
        double result;
        Operator operation;

        switch (operator) {
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
                return 0.0;
        }

        result = operation.calculate();
        return result;
    }
}
