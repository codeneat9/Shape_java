// Cylinder.java
import java.util.Scanner;
// Cylinder class is a subclass of Shape class and implements Volume interface
class Cylinder extends Shape implements Volume {
    double radius, height;
    // Constructor
    Cylinder() { super("Cylinder"); }
    // Overriding the getInput method
    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        radius = sc.nextDouble();
        System.out.print("Enter height: ");
        height = sc.nextDouble();
    }
    // Overriding the calculateArea and calculatePerimeter methods
    void calculateArea() { System.out.println("Surface Area: " + (2 * Math.PI * radius * (radius + height))); }
    void calculatePerimeter() { System.out.println("Cylinder has no perimeter."); }
    public void calculateVolume() { System.out.println("Volume: " + (Math.PI * radius * radius * height)); }
}
