public class JAVA18PATTERN {
    public static void main(String[] args) {
        for (int i=0;i<=3;i++)
        {
            for (int j=0;j<=3-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
