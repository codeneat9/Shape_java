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
