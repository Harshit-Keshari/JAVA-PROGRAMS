import java.util.*;

public class JAVA43RECURSION {
    public static int fact(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        else
        {
            return n * fact(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int num=sc.nextInt();
        int facto=fact(num);
        System.out.println("Factorial of "+num+" is "+facto);
    }
}
