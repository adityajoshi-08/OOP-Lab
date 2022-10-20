package Questions;

class FinalShape{
    public final void print(){
        System.out.println("This is a final shape");
    }
}
public class FinalMethods extends FinalShape{
//    public void print(){
//        System.out.println("This is inherited shape");
//    }

    public static void main(String[] args) {
        FinalMethods fm = new FinalMethods();
        fm.print();
    }
}
