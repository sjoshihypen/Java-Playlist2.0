import java.util.HashMap;
import java.util.Map;

public class Hash_Map_Iteration {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Add elements to the HashMap
        hashMap.put("Sushnat Joshi", 10);
        hashMap.put("Aditi Dogra", 19);
        hashMap.put("Vivek Singh", 30);
        hashMap.put("Ankita Kumari", 12);
        hashMap.put("Sanaya Shai", 15);

        // Printing System 
        System.out.println("Iterating through all elements in the HashMap:");

        // Using entrySet() to get both key and value in the iteration
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            int  value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
