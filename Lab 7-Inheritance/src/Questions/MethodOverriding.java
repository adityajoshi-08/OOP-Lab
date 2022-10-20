package Questions;

class Shape {
    private String color;
    public Shape (String color) {
        this.color = color;
    }
    public String toString() {
        return "Shape of color=\"" + color + "\""; }
    public double getArea() {
        System.err.println("Shape unknown! Cannot compute area!"); return 0; // Need a return to compile the program
    } }

class Rectangle extends Shape { // Private member variables
    private int length;
    private int width;
    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    public String toString() {
        return "Rectangle of length=" + length + " and width=" + width + ", subclass of " + super.toString(); }
        public double getArea() { return length*width; }
}

class Triangle extends Shape { // Private member variables private int base;
    private int height;
    private int base;
    // Constructor
    public Triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }
    public String toString() {
        return "Triangle of base=" + base + " and height=" + height + ", subclass of " + super.toString();
    }
    public double getArea() { return 0.5*base*height; }
}


public class MethodOverriding {
    public static void main(String[] args) {
        Shape s1 = new Rectangle("red", 4, 5);
        System.out.println(s1);
        System.out.println("Area is " + s1.getArea());
        Shape s2 = new Triangle("blue", 4, 5);
        System.out.println(s2);
        System.out.println("Area is " + s2.getArea());
    }
}
