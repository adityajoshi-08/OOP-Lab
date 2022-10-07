package StringHandling;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
//        String - length() equals() compareTo() concat()
        String s1 = "Aditya";
        System.out.println(s1.length());

        Scanner in = new Scanner(System.in);
//        String s2 = in.nextLine();
//        System.out.println(s1.equals(s2));
//
//        System.out.println(s1.compareTo(s2));

        String s2 = s1.concat("adit");
        System.out.println(s2);

    }
}
