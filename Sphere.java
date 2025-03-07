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
