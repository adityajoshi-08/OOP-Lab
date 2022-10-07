class MyStatic {
    int a;
    static int b;

    public MyStatic(){
        b++;
    }

    public void showData(){
        System.out.println("a = " + a);
        System.out.println("b = "+ b);
    }
}

public class StaticDemo{
    public static void main(String[] args) {
        MyStatic s1 = new MyStatic();
        s1.showData();
        MyStatic s2 = new MyStatic();
        s2.showData();
    }
}