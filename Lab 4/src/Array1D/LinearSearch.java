package Array1D;

import java.util.Scanner;

public class LinearSearch {

    static int linearSearch(int[] arr, int element){
        for (int i = 0; i < arr.length; i++) {
                if (arr[i] == element){
                    return i;
                }
        }
        return -1;
    }


    public static void main(String[] args) {

        int[] array = new int[5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        System.out.println(linearSearch(array,3));
    }
}
