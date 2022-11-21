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
        FinalMethods fm2 = new FinalMethods();
        FinalMethods fm3  = fm;

        fm.print();
    }
}
