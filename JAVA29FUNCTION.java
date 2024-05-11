import java.util.Scanner;

public class JAVA29FUNCTION {
    public static int sum(int x,int y)
    {
        int add=x+y;
        return add;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Value of a and b: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int add= sum(a,b);
        System.out.println("Sum is: "+add);
    }
}
