public class Circle {
    static double PI;
    private double radius;

    Circle(double radius) {
        this.radius = radius;
        Circle.PI = 3.141;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return (PI * radius * radius);
    }

    public static void getCircumference(double radius) {
        System.out.println("Circumference = " + 2 * PI * radius);
    }
}
class TestCircle {
    public static void main(String args[]) {
        Circle c1 = new Circle(2.3);
        c1.area();
        Circle.getCircumference(2.3);
        Circle c2 = new Circle(3.45);
        c2.area();
        c2.getCircumference(3.45);
    }
}