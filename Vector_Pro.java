import java.util.Vector;

public class Vector_Pro{
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        // Add elements at vector
        vector.addElement("Sushant Joshi");
        vector.addElement("Aditi Dogra");
        vector.addElement("Vivek Singh");

        // Get element at index 2
        String element = vector.elementAt(1);
        System.out.println("Element At Index 2: " + element);

        // Remove element "Vivek" from the vector
        vector.removeElement("Vivek Singh");
        System.out.println("After Remove Element : " + element);

        // Get size of the vector
        int size = vector.size();
        System.out.println("Size of the vector: " + size);

        // Print the remaining elements of the vector
        System.out.println("Remaining elements:");
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.elementAt(i));
        }
    }
}
