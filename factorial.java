import  java.util.Scanner; 
public class factorial {
    public static int fact(int num){
        if (num == 0) {  
            return 1;
        } else {
            return num  * fact(num - 1);
        }
    }
    public  static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number Here : " );
        int x = sc.nextInt();

        int result = fact(x);
        System.out.println("Return Result Of Factorial Number :  "+ result); 
        sc.close();
    }
}