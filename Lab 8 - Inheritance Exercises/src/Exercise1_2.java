// No need to print
public class Exercise1_2 {
    public static void main(String[] args) {
        System.out.println("For cy1");
        Cylinder cy1 = new Cylinder();
        System.out.println("Radius is "+ cy1.getRadius());
        System.out.println("Height is "+ cy1.getHeight());
        System.out.println("Color is "+ cy1.getColor());
        System.out.println("Base Area is "+ cy1.getArea());
        System.out.println("Volume is "+ cy1.getVolume());

        System.out.println("For cy2 ");
        Cylinder cy2 = new Cylinder(5.0, 2.0);
        System.out.println("Radius is "+ cy2.getRadius());
        System.out.println("Height is "+ cy2.getHeight());
        System.out.println("Color is "+ cy2.getColor());
        System.out.println("Base Area is "+ cy2.getArea());
        System.out.println("Volume is "+ cy2.getVolume());
    }
}

class Circle{
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea(){
        return this.radius * this.radius * 22/7;
    }
}

class Cylinder extends Circle{
    private double height;

    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return getArea()*height;
    }
}