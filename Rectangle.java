// Rectangle.java
import java.util.Scanner;
// Rectangle class is a subclass of Shape class
class Rectangle extends Shape {
    double length, width;
    // Constructor
    Rectangle() { super("Rectangle"); }
    // Overriding the getInput method
    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter width: ");
        width = sc.nextDouble();
    }
    // Overriding the calculateArea and calculatePerimeter methods
    void calculateArea() { System.out.println("Area: " + (length * width)); }
    void calculatePerimeter() { System.out.println("Perimeter: " + (2 * (length + width))); }
}
