// print 1 t0 5 using recursion


public class JAVA02RECURSIONEX {
    public static void print(int n)
    {
        if(n==6)
        {
            return;
        }
        else
        {
            System.out.println(n);
            print(n+1);
        }
    }
    public static void main(String[] args) {
        int a=1;
        print(a);
    }
}
