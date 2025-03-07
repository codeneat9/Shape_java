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
