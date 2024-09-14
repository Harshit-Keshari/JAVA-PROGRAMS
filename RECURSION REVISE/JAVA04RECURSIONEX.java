// calculate factorial using recursion

public class JAVA04RECURSIONEX {
    public static int fact(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }

        return n*fact(n-1);
    }
    public static void main(String[] args) {
        int a=5;
        int c=fact(a);
        System.out.println(c);
    }
}
