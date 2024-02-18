public class Box {

    double width;
    double height;
    double depth;

    Box() { // Default Constructor
        width = height = depth = -1;
    }

    Box(double w, double h, double d) { // Parameterized Constructor
        width = w;
        height = h;
        depth = d;
    }

    Box(double len) { // Parameterized Constructor
        width = height = depth = len;
    }

    double volume() { // Create a function "volume"
        return width * height * depth;
    }

    public static void main(String[] args) { // Main method
        Box mybox1 = new Box();
        Box mybox2 = new Box(10, 20, 15);
        Box mybox3 = new Box(7);

        double vol;
        vol = mybox1.volume();
        System.out.println("Volume Is Box 1st: " + vol);

        vol = mybox2.volume();
        System.out.println("Volume Is Box 2nd: " + vol);

        vol = mybox3.volume();
        System.out.println("Volume Is Box 3rd: " + vol);
    }
}