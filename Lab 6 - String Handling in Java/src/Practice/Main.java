package Practice;

import java.util.Arrays;
import java.lang.StringBuffer;
class Main2{
    protected int a;
    private int b;


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
public class Main {


    public static void main(String[] args) {
        String s1 = new String("Aditya");
        String s2 = new String("joshi");
        s2 = s1;
        System.out.println(s2);
        s1 = "JJ";
        System.out.println(s2);
    }
}