import java.util.Scanner;

public class JAVA03INPUT {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name=sc.nextLine();
        System.out.println("Your name is "+name);
        System.out.println("Enter 1st Number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int b = sc.nextInt();
        int sum=a+b;
        System.out.println("Sum is "+sum);

        sc.close();
    }
}
