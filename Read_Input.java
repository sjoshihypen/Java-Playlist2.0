import java.util.Scanner;

public class Read_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name Here : ");
        String name = sc.nextLine();

        System.out.println("Hello, " + name + "!");
        sc.close();
    }
}
