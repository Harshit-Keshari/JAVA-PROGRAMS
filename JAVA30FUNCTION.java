import java.util.Scanner;
public class JAVA30FUNCTION {
    public static int product (int a, int b){
        int mul=a*b;
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 Number: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int prod=product(x,y);
        System.out.println("Product is: "+prod);
    }   
}