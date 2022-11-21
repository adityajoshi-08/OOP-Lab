package Exercises;

import java.util.Arrays;

interface BinaryInterface{
    void toBinary(int N);

}

class OneComplement implements BinaryInterface{
    int[] Arr = new int[8];

    public void toBinaryComplement(int N) {
        if (N > -128 && N < 128){
            String bin;
            bin = Integer.toBinaryString(N);
            int binLength = bin.length();
            System.out.println(binLength);
            if (N < 0){
                for (int i = 0; i < 8; i++) {
                    Arr[Arr.length-i-1] = Integer.parseInt(String.valueOf(bin.charAt(binLength-i-1)));
                }
            } else if (N > 0){
                for (int i = 0; i < binLength; i++) {
                    Arr[Arr.length-i-1] = Integer.parseInt(String.valueOf(bin.charAt(binLength-i-1)));
                }
            }

            for (int i = 0; i < Arr.length; i++) {
                if (Arr[i] == 0){
                    Arr[i] = 1;
                } else{
                    Arr[i] = 0;
                }
            }
            System.out.println(Arrays.toString(Arr));
        } else{
            System.out.println("Not an 8 bit number");
        }
    }

    @Override
    public void toBinary(int N) {
        if (N > -128 && N < 128){
            String bin;
            bin = Integer.toBinaryString(N);
            int binLength = bin.length();
            System.out.println(binLength);
            if (N < 0){
                for (int i = 0; i < 8; i++) {
                    Arr[Arr.length-i-1] = Integer.parseInt(String.valueOf(bin.charAt(binLength-i-1)));
                }
            } else if (N > 0){
                for (int i = 0; i < binLength; i++) {
                    Arr[Arr.length-i-1] = Integer.parseInt(String.valueOf(bin.charAt(binLength-i-1)));
                }
            }
            System.out.println(Arrays.toString(Arr));
        } else{
            System.out.println("Not an 8 bit number");
        }
    }


}



public class Exericse2 {
    public static void main(String[] args) {
        OneComplement o = new OneComplement();
        o.toBinary(127);
//        System.out.println(Integer.toBinaryString());
        System.out.println();
    }
}
