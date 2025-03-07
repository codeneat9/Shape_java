// Sphere.java
import java.util.Scanner;
// Sphere class is a subclass of Shape class and implements Volume interface
class Sphere extends Shape implements Volume {
    double radius;
    // Constructor
    Sphere() { super("Sphere"); }
    // Overriding the getInput method 
    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        radius = sc.nextDouble();
    }
    // Overriding the calculateArea and calculatePerimeter methods
    void calculateArea() { System.out.println("Surface Area: " + (4 * Math.PI * radius * radius)); }
    void calculatePerimeter() { System.out.println("Sphere has no perimeter."); }
    public void calculateVolume() { System.out.println("Volume: " + ((4.0 / 3) * Math.PI * Math.pow(radius, 3))); }
}
