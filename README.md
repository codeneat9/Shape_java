# Shape Calculator (Menu-Driven Java Program)

This Java program is a **menu-driven application** that calculates the **area, perimeter, and volume** of various 2D and 3D shapes.  
It follows the use of **abstract classes and interfaces**.

---

## Features
- Menu-driven user interaction  
- Uses **Abstract Class (`Shape`)** for common properties  
- Implements **Interface (`Volume`)** for 3D shapes  
- **Separate Java files** for better modularity  
- Supports **both 2D and 3D shapes**  


---


### Class Overview

#### Shape
- Abstract class
- Contains calculateArea() and calculatePerimeter() methods
- 
#### Volume
- Interface for 3D shapes
- Contains calculateVolume() method
  
#### Circle
- Extends Shape
- Calculates area and perimeter of a circle
  
#### Rectangle
- Extends Shape
- Calculates area and perimeter of a rectangle
  
#### Square
- Extends Shape
- Calculates area and perimeter of a square
  
#### Sphere
- Extends Shape, Implements Volume
 Calculates surface area and volume

#### Cylinder
- Extends Shape, Implements Volume
- Calculates surface area and volume
  
#### EquilateralPyramid
- Extends Shape, Implements Volume
- Calculates surface area and volume
  
#### Main
- Runs the program
- Takes user input and calls appropriate methods

---


## Class & Method Details

### `Shape.java` (Abstract Class)
- `abstract void calculateArea()`
- `abstract void calculatePerimeter()`
- Constructor: `Shape(String name)`

### `Volume.java` (Interface)
- `void calculateVolume()`

### `Circle.java` (2D Shape)
- `void getInput()`
- `void calculateArea()`
- `void calculatePerimeter()`

### `Rectangle.java` (2D Shape)
- `void getInput()`
- `void calculateArea()`
- `void calculatePerimeter()`

### `Square.java` (2D Shape)
- `void getInput()`
- `void calculateArea()`
- `void calculatePerimeter()`

### `Sphere.java` (3D Shape, Implements `Volume`)
- `void getInput()`
- `void calculateArea()`
- `void calculatePerimeter()`
- `void calculateVolume()`

### `Cylinder.java` (3D Shape, Implements `Volume`)
- `void getInput()`
- `void calculateArea()`
- `void calculatePerimeter()`
- `void calculateVolume()`

### `EquilateralPyramid.java` (3D Shape, Implements `Volume`)
- `void getInput()`
- `void calculateArea()`
- `void calculatePerimeter()`
- `void calculateVolume()`
  
### `Main.java` (Program Entry)
- **Menu System**: Lets the user select a shape.
- Calls `getInput()`, `calculateArea()`, `calculatePerimeter()`, and `calculateVolume()` (if applicable).
- Loops until the user selects "Exit".

---

## How to Run the Program
### 1. Clone the Repository
   - git clone https://github.com/codeneat9/Shape_java.git
   cd Shape_java
   - compile the .java file (javac)
   - run the .java file 
   
## Usage Example
<img width="205" alt="image" src="https://github.com/user-attachments/assets/0ceb806b-40dc-4c4c-a638-dd3da21db290" />

## Author
### Yashwith Behara

