class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    void meth(Test ob) {
        ob.a *= 2;
        ob.b /= 2;
    }
}

public class call_by_reference {
    public static void main(String[] args) {
        Test ob = new Test(15, 20);
        System.out.println("Before Call: " + ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println("After Call: " + ob.a + " " + ob.b);
    }
}