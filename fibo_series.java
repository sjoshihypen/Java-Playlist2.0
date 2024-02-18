import java.util.Scanner;
class fibo_series{

        static int fib(int i) {
        if (i <= 1)           // Base Case
            return i;
 
            return fib(i - 1) + fib(i - 2);       // Recursive call
    }
 
    public static void main(String[ ] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number Where Want To Print Series : ");
        int num  = sc.nextInt( );
 
        for (int  x = 0;  x < num;  x++) {
            System.out.print(fib(x) + " ");
        }
        sc.close();
    }
}