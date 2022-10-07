package Array1D;

public class MinMax {

    static int minimum(int arr[]){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    static int maximum(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {2,53425,3452,43523,53523,5};
        System.out.println("Minimum = " +minimum(array));
        System.out.println("Maximum = " +maximum(array));
    }
}
