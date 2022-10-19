package Array1D;

import java.util.Scanner;

public class SpiltIntoEvenOdd {

    public static void main(String[] args) {

        int[] array = new int[5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        int[] even = new int[array.length];
        int evenCounter = 0;
        int[] odd = new int[array.length];
        int oddCounter = 0;


        for (int i = 0; i < array.length; i++) {
            if (array[i] %2 == 0){
                even[evenCounter++] = array[i];
            } else{
                odd[oddCounter++] = array[i];
            }
        }

        System.out.print("Even array is : ");
        for (int i = 0; i < evenCounter ; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();

        System.out.print("Odd array is : ");
        for (int i = 0; i < oddCounter; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();
    }

}
