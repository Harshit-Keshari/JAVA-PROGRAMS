// PRINT NUMBER FROM 1 to 5 USING RECURSION 

public class JAVA41RECURSION {

    public static void printNum(int n)
    {
        if(n==6)
        {
            return;
        }
        System.out.println(n);
        printNum(n+1);
    }
    public static void main(String[] args) {
        int i=1;
        printNum(i);
    }
    
}
