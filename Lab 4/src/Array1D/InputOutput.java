package Array1D;

import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
