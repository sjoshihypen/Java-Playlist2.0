public class String_Methods {
    public static void main(String[] args) {
        
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "Everyone";

        // Demonstrate equals()
        System.out.println("The String Method : equals()");
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1.equals(str3): " + str1.equals(str3));
        System.out.println();

        // Demonstrate trim()

        System.out.println("The String Method : trim()");
        System.out.println("Original String: '" + str3 + "'");
        System.out.println("After Triming: '" + str3.trim() + "'");
        System.out.println();

        // Demonstrate length()

        System.out.println("The String Method : length()");
        System.out.println("Length of '" + str3 + "': " + str3.length());
        System.out.println();

        // Demonstrate substring()

        System.out.println("The String Method : substring()");
        System.out.println("Original String: '" + str1 + "'");
        System.out.println("Substring from index 0 to 4: '" + str1.substring(0, 4) + "'");
        System.out.println();

        // Demonstrate compareTo()
        String str4 = "Sushant";
        String str5 = "Aditi";

        System.out.println("The String Method : compareTo()");
        System.out.println("str4.compareTo(str4): " + str4.compareTo(str4));
        System.out.println("str5.compareTo(str5): " + str5.compareTo(str5));
    }
}

