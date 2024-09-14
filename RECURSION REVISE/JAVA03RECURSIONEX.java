// wap to calculate sum of first n natural number using recursion

public class JAVA03RECURSIONEX {
    public static void sum(int start,int end,int sum)
    {
        if(start==end)
        {
            sum+=start;
            System.out.println(sum);
            return;
        }
            sum+=start;
            sum(start+1,end,sum);
        
    }
    public static void main(String[] args) {
        int a=1;
        int b=10;
        sum(a,b,0);
    }
}
