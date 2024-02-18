import java.util.*;

public class Retrieve_Elements {

    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        arrayList.add("Sushant Joshi");
        arrayList.add("Aditi Dogra");
        arrayList.add("Sanaya Shai");
        arrayList.add("Vivek Singh");
        arrayList.add("Aakansha Sharma");

        // Display the elements in the ArrayList
        System.out.println("Elements in the ArrayList: " + arrayList);

        // Get user input for the index to retrieve
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the index to retrieve: ");
            int index = sc.nextInt();

            // Retrieve the element at the specified index
            try {
                String element = getElementAtIndex(arrayList, index);
                System.out.println("Element at index " + index + ": " + element);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Error: Index out of bounds. Please enter a valid index.");
            }
        }
    }

    // Method to retrieve an element from a specified index in an ArrayList
    private static String getElementAtIndex(ArrayList<String> list, int index) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("Index " + index + " Is Out Of Bounds.");
        }
        return list.get(index);
    }
}