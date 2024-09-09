// Write a program to print number form 5 to 1 using recursion

/*

normal form
for(int i=5;i>0;i--)
{
    system.out.println(i);
}

*/


import java.util.*;

public class JAVA40RECURSION {

    public static void printnum(int n){
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        printnum(n-1);
    }
    public static void main(String[] args) {
        int i=5;
        printnum(i);
    }    
}
