class box{
    double height;
    double width;
    double depth;

    // Constructor with no parameters
       box(){
       this(0,0,0);
    }

    // Constructor with three parameters
        box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

     // Method to calculate and return the volume of the box
        double volume() {
        return height * width * depth;
    }
}

class box_new extends box {
    double weight;

    // Constructor with four parameters 
    public box_new(double height, double width, double depth, double weight) {
        super(height, width, depth);  // Calling the base class constructor
        this.weight = weight;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of the base class (Box)
        box mybox1 = new box(5, 3, 2);

        // Calculating and printing the volume of the box
        System.out.println("Volume of Box1 : " + mybox1.volume());

        // Creating an object of the derived class (BoxNew)
        box_new mybox2 = new box_new(5, 3, 2, 10);

        // Calculating and printing the volume of the box from the derived class
        System.out.println("Volume of Box2 : " + mybox2.volume());

        // Accessing the weight variable from the derived class
        System.out.println("Weight of Box2 : " + mybox2.weight);
    }
}