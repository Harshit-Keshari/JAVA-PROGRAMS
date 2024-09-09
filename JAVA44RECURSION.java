import java.util.*;

public class JAVA44RECURSION {
    public static void fibo(int a,int b,int n)
    {
        if(n==0)
        {
            return;
        }
        int c=a+b;
        System.out.println(c);
        fibo(b,c,n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num=sc.nextInt();
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        fibo(a,b,num-2);
    }
}
