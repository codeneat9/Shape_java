// Equilateral Pyramid.java
import java.util.Scanner;
// EquilateralPyramid class is a subclass of Shape class and implements Volume interface
class EquilateralPyramid extends Shape implements Volume {
    double base, height;
    // Constructor
    EquilateralPyramid() { super("Equilateral Pyramid"); }
    // Overriding the getInput method
    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base side: ");
        base = sc.nextDouble();
        System.out.print("Enter height: ");
        height = sc.nextDouble();
    }
