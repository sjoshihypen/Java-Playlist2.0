public class Equal_Methods {
    public static void main(String[] args) {
        // Creating two strings with the same content
        String str1 = "Hello";
        String str2 = new String("Hello");

        // Using equals() to compare content
        boolean contentEqual = str1.equals(str2);
        System.out.println("Using equals(): " + contentEqual); // true

        // Using == to compare references
        boolean referenceEqual = (str1 == str2);
        System.out.println("Using == : " + referenceEqual);    // false (different objects)

    }
}
