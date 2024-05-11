import java.util.*;

public class JAVA06COMPARE {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 Number: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==b)
        {
            System.out.println(a+" is Equal to "+b);
        }
        else if(a>b)
        {
            System.out.println(a+" is greater than "+b);
        }
        else
        {
            System.out.println(b+" is greater than "+a);
        }
    }
}
