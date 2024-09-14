// print all subset of first n natural number

import java.util.ArrayList;

public class JAVA59SUBSET {
    public static void subs(int n,ArrayList<Integer> subset)
    {
        if(n==0)
        {
            System.out.println(subset);
            return;
        }
        subset.add(n);
        subs(n-1, subset);
        subset.remove(subset.size()-1);
        subs(n-1, subset);
    }
    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> s=new ArrayList<>();
        subs(n, s);
    }
}
