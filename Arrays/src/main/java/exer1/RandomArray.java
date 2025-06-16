package exer1;

import java.util.Random;

public class RandomArray {
    public static void array() {
        Random rand = new Random();
        int maxNegative = -11, minPlus = 11;
        int swapMin = 0, swapMax = 0, swap = 0;
        int[] randomArray = new int[20];

        System.out.print("Массив =");
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = rand.nextInt(-10, 10);
            if (randomArray[i] < minPlus & randomArray[i] > 0) {
                minPlus = randomArray[i];
                swapMax = i;
            }
            if (randomArray[i] > maxNegative & randomArray[i] < 0) {
                maxNegative = randomArray[i];
                swapMin = i;
            }
            System.out.print(" " + randomArray[i]);
        }
        swap = randomArray[swapMax];
        randomArray[swapMax] = randomArray[swapMin];
        randomArray[swapMin] = swap;

        System.out.println();
        System.out.print("Массив =");
        for (int i = 0; i < randomArray.length; i++) {
            System.out.print(randomArray[i] + " ");
        }
    }
}
