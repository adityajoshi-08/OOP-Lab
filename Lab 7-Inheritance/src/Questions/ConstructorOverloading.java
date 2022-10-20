package Questions;


class Room {
    double length,breadth,height;
    public Room(){
        length=-1;
        breadth=-1;
        height=-1;
    }

     public Room(double l,double b,double h) {
        length=l;
        breadth=b;
        height=h;
    }
    Room(double len) { // Single parametrised constructor
         length=breadth=height=len;
    }

    double volume() {
        return length*breadth*height;
    }
}
public class ConstructorOverloading {
    public static void main(String args[]) {
        Room a = new Room(20, 30, 40);
        Room b = new Room();
        Room c = new Room(10);
        double vol;
        vol = a.volume();
        System.out.println("Volume of room a is " + vol);
        vol = b.volume();
        System.out.println("Volume of room b is " + vol);
        vol = c.volume();
        System.out.println("Volume of room c is " + vol);
    }
}
