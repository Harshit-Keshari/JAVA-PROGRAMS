// calculate height of stack log n
class JAVA07{
    public static int height(int x,int n)
    {
        if(x==0)
        {
            return 0;
        }
        if(n==0)
        {
            return 1;
        }
        
        if(n%2==0)
        {
            return height(x,n/2)*height(x, n/2);
        }
        else
        {
            return height(x, n/2)*height(x, n/2)*x;
        }
    }
    public static void main(String[] args) {
        int x=2;
        int n=5;
        int res=height(x, n);
        System.out.println(res);
    }
}