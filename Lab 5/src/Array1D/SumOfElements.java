package Array1D;

import java.util.Scanner;

public class SumOfElements {

    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println("Sum = " + sum);
    }
}
