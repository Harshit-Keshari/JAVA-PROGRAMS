// print number of possible path form 0,0 to n-1,m-1

public class JAVA56MAZEPATH {
    public static int maze(int n,int m,int i,int j)
    {
        if(i==n||j==m)
        {
            return 0;
        }
        if(i==n-1 && j==m-1)
        {
            return 1;
        }
            int count1 = maze(n, m, i+1, j);
            int count2 = maze(n, m, i,j+1);
        return count1+count2;
    }
    public static void main(String[] args) {
        int n=3;
        int m=3;
        int res=maze(n, m, 0, 0);
        System.out.println(res);
    }
}
