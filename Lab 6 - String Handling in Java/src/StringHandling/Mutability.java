package StringHandling;

// Program to check mutability and immutability

public class Mutability {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Aditya");

        s1.replace(1,2, "adcd");
        System.out.println(s1.charAt(5));
        System.out.println(s1);


        s1.insert(3,"xy");
        System.out.println(s1.charAt(5));
        System.out.println(s1);

        s1.replace(2,3, "new");
        System.out.println(s1.charAt(5));
        System.out.println(s1);
    }
}
