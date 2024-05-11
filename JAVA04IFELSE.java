// if else is a conditional statement use to check and decide the result according to condition 

import java.util.*;

public class JAVA04IFELSE {
    public static void main(String[] args)
    {

        Scanner sc=new Scanner (System.in);
        System.out.println("Enter Your Age: ");
        
        int age=sc.nextInt();
        
        if(age >= 18)
        {
            System.out.println("Can Drive");
        }
        else 
        {
            System.out.println("Minor");
        }
    }
}
