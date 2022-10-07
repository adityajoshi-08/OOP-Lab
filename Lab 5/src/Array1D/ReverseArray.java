package Array1D;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        int temp;

        for (int i = 0; i < array.length/2; i++) {
             temp = array[i];
             array[i] = array[array.length-i-1];
            array[array.length-i-1] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
