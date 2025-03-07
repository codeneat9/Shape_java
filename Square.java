// Square.java
import java.util.Scanner;
// Square class is a subclass of Shape class
class Square extends Shape {
    double side;
    // Constructor
    Square() { super("Square"); }
    // Overriding the getInput method
    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side: ");
        side = sc.nextDouble();
    }
    // Overriding the calculateArea and calculatePerimeter methods
    void calculateArea() { System.out.println("Area: " + (side * side)); }
    void calculatePerimeter() { System.out.println("Perimeter: " + (4 * side)); }
}
