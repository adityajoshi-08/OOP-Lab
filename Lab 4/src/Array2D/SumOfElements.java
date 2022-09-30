package Array2D;

import java.util.Scanner;


public class SumOfElements {

        public static void main(String[]args){
            int arr[][] = new int[3][3];
            Scanner in = new Scanner(System.in);
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = in.nextInt();
                }
            }

            int sum = 0;

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    sum += arr[i][j];
                }
            }
            System.out.println("Sum = " + sum);
        }
}
