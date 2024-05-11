import java.util.*;

public class JAVA05EVENODD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number To Check: ");
        int num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println(num+" Is Even");
        }
        else{
            System.out.println(num+" is Odd");
        }
    }
}
