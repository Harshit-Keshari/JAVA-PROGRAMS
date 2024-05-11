import java.util.*;

public class JAVA12NATURAL {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int sum=0,i=0;
            System.out.println("Enter Number: ");
            int n=sc.nextInt();
            for(i=0;i<=n;i++)
            {
                sum=sum+i;
            }
            System.out.println("Sum is: "+sum);
        }
}
