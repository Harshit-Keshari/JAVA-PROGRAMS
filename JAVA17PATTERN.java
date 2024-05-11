// Inverted Half Pyramid
/*
    
    *****
    ****
    ***
    **
    *

 */

public class JAVA17PATTERN {
    public static void main(String[] args) {
        
        for(int i=0;i<=3;i++){
            for(int j=3;j>=i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
