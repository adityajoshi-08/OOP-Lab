public class Fibonnacci {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int third;
//        System.out.println(first);
//        System.out.println(second);
        for (int i = 0; i < 18; i++) {
            third = first + second;
            System.out.println(third);
            first = second;
            second = third;
        }
    }
}
