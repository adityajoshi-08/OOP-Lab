package StringHandling;

//program to initialize string with and without mutability concept

import java.util.Scanner;

public class Initiallization {
    public static void main(String[] args) {
        String s1 = "Aditya Joshi";
//        System.out.println(s1);
        String s3 = "Aditya Joshi";

        String s2 = new String("Aditya Joshi");
//        System.out.println(s1.equals(s2));

//        Input string from user

        Scanner in = new Scanner(System.in);
//        String s4 = in.nextLine();
//        System.out.println(s4.equals(s1));

        StringBuffer sb2 = new StringBuffer("Aditya Joshi");
        System.out.println(sb2);

    }
}
