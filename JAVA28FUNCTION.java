import java.util.Scanner;
public class JAVA28FUNCTION {
    public static void myfunction(String name)
    {
        System.out.println("Name is "+name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name: ");
        String a=sc.nextLine();
        myfunction(a);
    }
}
