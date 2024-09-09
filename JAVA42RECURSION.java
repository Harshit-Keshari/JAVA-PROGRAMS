import java.util.*;

public class JAVA42RECURSION {
    public static int naturalSum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else
        {
            return n + naturalSum(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num=sc.nextInt();
        int sum=naturalSum(num);
        System.out.println("Sum is: "+sum);
    }
}
