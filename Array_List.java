import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        // Adding elements to the ArrayList
        names.add("Sushant Joshi");
        names.add("Aditi Dogra");
        names.add("Sanaya Shai");

        // Iteration through the ArrayList 
        System.out.println("Iterating using enhanced for loop:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
