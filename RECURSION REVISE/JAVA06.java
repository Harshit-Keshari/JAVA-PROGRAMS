// calculate height of stack x^n
class JAVA06{
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
        int nm1=height(x,n-1);
        int pow=x*nm1;
        return pow;
    }
    public static void main(String[] args) {
        int x=2;
        int n=5;
        int res=height(x, n);
        System.out.println(res);
    }
}