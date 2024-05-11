import java.util.*;
public class JAVA07GREETIF {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 for English\n2 for Hindi\n3 for French");
        System.out.println("Enter Choice: ");
        int a=sc.nextInt();
        if(a==1)
        {
            System.out.println("Hello");
        }
        else if(a==2)
        {
            System.out.println("Namaste");
        }
        else if(a==3)
        {
            System.out.println("Bonjour");
        }
        else
        {
            System.out.println("Invalid Choice");
        }
    }
}
