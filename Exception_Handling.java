import java.util.Scanner;

public class Exception_Handling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Performing some operation that may "throw" an exception
            System.out.print("Enter 1st Number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter 2nd Number: ");
            int num2 = sc.nextInt();

            int result = num1 / num2;

            System.out.println("Result of division: " + result);
        }  catch (ArithmeticException e) {
            // Catching exception if division by zero happens :
            System.err.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            // Catching a more general exception :
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            // In this block will always executed, regardless of whether an exception occurred or not
            System.out.println("Hi 😊, Everyone Finally Block is Executed.");

            // Close the scanner 
            sc.close();
        }

        System.out.println("Designed by Sushant Joshi.");
    }
}

