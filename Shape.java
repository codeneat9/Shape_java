// Shape.java
abstract class Shape {
    String shapeName; 
    // Constructor
    Shape(String name) {
        this.shapeName = name;
    }
     // Abstract methods
    abstract void calculateArea();
    abstract void calculatePerimeter();
}
