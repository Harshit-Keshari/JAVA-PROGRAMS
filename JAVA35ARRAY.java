import java.util.*;
public class JAVA35ARRAY {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number Of Rows: ");
        int row=sc.nextInt();
        System.out.println("Enter Number of Column: ");
        int cols=sc.nextInt();
        int matrix[][]=new int[row][cols];
        System.out.println("Enter Elements: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<cols;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter Element to search: ");
        int x=sc.nextInt();

        for(int i=0;i<row;i++)
        {
            for (int j=0;j<cols;j++)
            {
                if(matrix[i][j]==x)
                {
                    System.out.println("Element at index: "+i+" "+j);
                }
            }
        }
    }    

}