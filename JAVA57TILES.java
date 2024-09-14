// find total number of ways to place the tiles of 1 * M into N * M floors

public class JAVA57TILES {
    public static int tile(int n,int m)
    {
        if(n==m)
        {
            return 2;
        }
        if(n<m)
        {
            return 1;
        }
        int vert=tile(n-m,m);
        int horz=tile(n-1,m);
        return vert+horz;
    }
    public static void main(String[] args) {
        int n=4,m=2;
        int res=tile(n, m);
        System.out.println(res);
    }
}
