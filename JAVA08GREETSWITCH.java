import java.util.*;
public class JAVA08GREETSWITCH {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Choice");
        int a=sc.nextInt();
        switch(a)
        {
            case 1:
            System.out.println("Hello");
            break;
            case 2:
            System.out.println("English");
            break;
            case 3:
            System.out.println("Bonjour");
            break;
            default:
            System.out.println("Invalid Choice");
        }
    }
}
 