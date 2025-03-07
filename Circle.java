// Circle.java
import java.util.Scanner;
// Circle class is a subclass of Shape class
class Circle extends Shape {
    double radius;
    // Constructor
    Circle() { super("Circle"); }
    // Overriding the getInput method
    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        radius = sc.nextDouble();
    }
