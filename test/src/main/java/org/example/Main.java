package org.example;

public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        int result = x + sum(x, y);
        System.out.println(result);
        test2();
        test3();
    }

    public static int sum(int x, int y){
        return x + y;
    }

    public static void test2(){
        int a, b = 1, c = 2, d;
        a = b + c;
        d = a % c;
        System.out.println(d);

        int i = 2;
        i += i++ + ++i;
        System.out.println(i);
    }

    public static void test3(){
        int number = 10;
        switch (number){
            case 10: System.out.println("10");
            case 20: System.out.println("20");
            case 30: System.out.println("30");
            default: System.out.println("default");
        }
    }
}