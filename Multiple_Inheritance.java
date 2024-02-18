// Interface 1
interface Shape {
    void drawing();
}

// Interface 2
interface Color {
    void setColor(String color);
}

// Class implementing multiple interfaces
class ColoredShape implements Shape, Color {
    private String color;

    // Implementing drawing method from Shape interface
    @Override
    public void drawing() {
        System.out.println("Drawing a colored shape");
    }

    // Implementing setColor method from Color interface
    @Override
    public void setColor(String color) {
        this.color = color;
        System.out.println("Pixel colors to: " + color);
    }

    // Additional method specific to ColoredShape
    public void displayInfo() {
        System.out.println("This is a colored shape with color: " + color);
    }
}

// Main class
public class Multiple_Inheritance {
    public static void main(String[] args) {
        // Creating an object of ColoredShape
        ColoredShape coloredShape = new ColoredShape();

        // Calling methods from both interfaces
        coloredShape.drawing();
        coloredShape.setColor("Red");

        // Calling an additional method specific to ColoredShape
        coloredShape.displayInfo();
    }
}
