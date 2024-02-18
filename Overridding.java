class Shape {
    // Method Overloading
    double calculateArea(double side) {
        return side * side;  // Area of a square
    }

    // Method Overriding
    double calculateArea(double length, double width) {
        return length * width;  // Area of a rectangle
    }
}

class Circle extends Shape {
    // Method Overriding
    @Override
    double calculateArea(double radius) {
        return Math.PI * radius * radius;  // Area of a circle
    }
}

public class Overridding {
    public static void main(String[] args) {
        Shape shape = new Shape();

        // Method Overloading - Square
        double squareArea = shape.calculateArea(5);
        System.out.println("Area of Square: " + squareArea);

        // Method Overriding - Rectangle
        double rectangleArea = shape.calculateArea(4, 6);
        System.out.println("Area of Rectangle: " + rectangleArea);

        Circle circle = new Circle();

        // Method Overriding - Circle
        double circleArea = circle.calculateArea(3);
        System.out.println("Area of Circle: " + circleArea);
    }
}
