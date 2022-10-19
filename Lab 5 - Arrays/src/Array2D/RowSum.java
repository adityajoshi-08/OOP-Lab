package Array2D;

import java.util.Scanner;
// program to find sum of elements of each row
public class RowSum {
    public static void main(String[] args) {

        int arr[][] = new int[3][3];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int[] rowSum = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }

            rowSum[i] = sum;
        }

        System.out.print("Sum of elements in the row is ");
        for (int i = 0; i < rowSum.length; i++) {
            System.out.print(rowSum[i] + " ");
        }
        System.out.println();
    }

}
