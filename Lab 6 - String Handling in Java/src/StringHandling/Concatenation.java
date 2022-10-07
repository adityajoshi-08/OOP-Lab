package StringHandling;

public class Concatenation {

    public static void main(String[] args) {
        String s1 = "Aditya";
        s1 += " Joshi";
        System.out.println(s1);

        StringBuffer sb1  = new StringBuffer("Aditya");
        sb1.append(" Joshi");
        System.out.println(sb1);
    }
}
