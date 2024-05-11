import java.util.*;

public class JAVA31FUNCTION {
    public static void fact(int n){
        int factorial=1;
        for(int i=n;i>=1;i--)
        {
            factorial=factorial*i;
        }
        System.out.println("Factorial is: "+factorial);
        return;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num=sc.nextInt();
        
        fact(num);
    }
}

