package inputFromUser;

import java.util.Scanner;

public class UsingScanner {
    public static void main(String[] args) {
        int num1;
        double double1;
        String numStr1;
        Scanner in = new Scanner(System.in);

        num1 = in.nextInt();
        double1 = in.nextDouble();
        numStr1 = in.nextLine();

        System.out.println(num1);
        System.out.println(double1);
        System.out.println(numStr1);
    }
}
