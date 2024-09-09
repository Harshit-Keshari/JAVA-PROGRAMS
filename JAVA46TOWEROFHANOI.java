import java.util.Scanner;

public class JAVA46TOWEROFHANOI {
    public static void TOH(int n,char source,char aux,char dest)
    {
        if(n==1)
        {
            System.out.println(n+" Moved from "+source +" to "+dest);
        }
        else
        {
            TOH(n-1,source,dest,aux);
            System.out.println(n+" Moved From "+source+" to "+dest);
            TOH(n-1,aux,source,dest);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Disk: ");
        int num=sc.nextInt();
        char s='A',a='B',d='C';
        TOH(num,s,a,d);
    }
}
