// Main.java
//Yashwith Behara
//23070126151
//AIML B3
import java.util.Scanner;
// Main class to test the Shape, Circle, Rectangle, Square, Sphere, Cylinder, EquilateralPyramid classes
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        // Display the menu until the user chooses to exit
        do {
            System.out.println("\n--- Select Shape ---");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Equilateral Pyramid");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            // Declare a Shape object
            Shape shape = null;
            switch (choice) {
                case 1 -> shape = new Circle();
                case 2 -> shape = new Rectangle();
                case 3 -> shape = new Square();
                case 4 -> shape = new Sphere();
                case 5 -> shape = new Cylinder();
                case 6 -> shape = new EquilateralPyramid();
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }
