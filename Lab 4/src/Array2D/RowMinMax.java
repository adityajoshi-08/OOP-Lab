package Array2D;

//program to find minimum and maximum element of each row

import java.util.Scanner;

public class RowMinMax {

    public static void main(String[] args) {

        int arr[][] = new int[3][3];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }


        int min;
        int max;

        for (int i = 0; i < arr.length; i++) {
            min = arr[i][0];
            max = arr[i][0];
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
                if (arr[i][j] < min){
                    min = arr[i][j];
                }
            }

            System.out.println("Minimum and maximum for row" + i+1);
            System.out.println("Minimum = "+min +" Maximum = " + max);
        }
    }
}
