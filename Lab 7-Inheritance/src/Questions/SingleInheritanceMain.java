package Questions;

public class SingleInheritanceMain {
    public static void main(String[] args) {
//        new E().show();
        A e = new B();
        System.out.println(e.getClass());
    }
}

class A{
    public int a =100;
}

class B extends A{
    public int a = 80;
}
class C extends B{
    public int a = 60;
}

class D extends C{
    public int a = 40;
}

class E extends D{
    public int a = 10;
    public void show(){
        System.out.println("E: "+this.a);
        System.out.println("D: "+((D) this).a);
        System.out.println("C: "+((C) this).a);
        System.out.println("B: "+((B) this).a);
        System.out.println("A: "+((A) this).a);
    }
}
