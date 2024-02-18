class Parents {
    // Method to make a sound
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}

// Derived class 1
class Child1 extends Parents {
    // Overriding the learning method
    public void learning() {
        System.out.println("Learning All Basic Fundamental Things.");
    }

    // New method for fun
    public void fun() {
        System.out.println("Having Fun Learning.");
    }
}

// Derived class 2
class Child2 extends Parents {
    // Overriding the fun method
    public void fun() {
        System.out.println("Go Outside They Living.");
    }
}

// Main class
public class RunTime_Polymorphism {
    public static void main(String[] args) {
        // Creating objects of different types
        Parents genericParent = new Parents();
        Child1 myChild1 = new Child1();
        Child2 myChild2 = new Child2();

        // Demonstrating runtime polymorphism
        System.out.println("Generic Parent sound:");
        genericParent.makeSound();

        System.out.println("\nChild1 learning:");
        myChild1.learning();

        System.out.println("\nChild1 fun:");
        myChild1.fun();

        System.out.println("\nChild2 fun:");
        myChild2.fun();
    }
}
