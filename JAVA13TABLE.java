import java.util.*;

public class JAVA13TABLE {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter Number: ");
        num=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+" X "+i+" = "+(num*i));
        }
    }
}
