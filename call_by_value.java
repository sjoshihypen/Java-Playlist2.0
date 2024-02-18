class Test {
    void py(int i,int j){
        i = i * 2;
        j = j / 2;
    }
}
public class call_by_value{
    public static void main(String[] args){
        Test x = new Test();
        int a = 8, b = 9;
        System.out.println("Sushant Joshi");
        System.out.println("Before Call "+ a +" "+ b);
        x.py(a,b);
        System.out.println("After  Call "+ a +" "+ b);
    }
}
