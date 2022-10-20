package Questions;

abstract class AbstractShape{ // Private member variable private
     String color;
    // Constructor
    public AbstractShape (String color) {
        this.color = color;
    }
    public String toString() {
        return "Shape of color=\"" + color + "\"";
    }
    // All Shape subclasses must implement a method called getArea()
    abstract public double getArea();
}
public class AbstractClass {
    public static void main(String[] args) {
//            AbstractShape s1 = new Rectangle("red", 4, 5);
//            System.out.println(s1);
//            System.out.println("Area is " + s1.getArea());
//            AbstractShape s2 = new Triangle("blue", 4, 5);
//            System.out.println(s2);
//            System.out.println("Area is " + s2.getArea());
//// Cannot create instance of an abstract class
//            AbstractShape s3 = new AbstractShape("green");// Compilation Error!!
    }
}
