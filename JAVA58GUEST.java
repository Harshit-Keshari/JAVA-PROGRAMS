// find number of ways in which you can invite n number of people in party note: guest can be come single or in pair

public class JAVA58GUEST {
    public static int guest(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        int single = guest(n-1);
        int pair= (n-1) * guest(n-2);
        return single+pair;
    }
    public static void main(String[] args) {
        int n=4;
        int res=guest(n);
        System.out.println(res);
    }
}
