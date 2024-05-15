import java.util.*;
public class JAVA34ARRAY {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number Of rows: ");
        int rows=sc.nextInt();
        System.out.println("Enter Number Of columns: ");
        int columns=sc.nextInt();

        int arr[][]=new int[rows][columns];

        System.out.println("Enter Elements: ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Array is: ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }   
}