import java.util.Scanner;

public class input {
    private static Scanner scanner = new Scanner(System.in);

    public static String inp() {
        System.out.println("Please enter a number / sign");
        return scanner.next();
    }
}
