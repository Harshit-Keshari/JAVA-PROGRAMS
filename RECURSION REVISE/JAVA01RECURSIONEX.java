// Print 5 to 1 using recursion

class JAVA01RECURSIONEX{

    public static void print(int n){
        if(n==0)
        {
            return;
        }
        else
        {
            System.out.println(n);
            print(n-1);
        }
    }
    public static void main(String[] args)
    {
        int a;
        a=5;
        print(a);
    }
}