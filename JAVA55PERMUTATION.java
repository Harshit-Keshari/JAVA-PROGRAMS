// print all permutation of string using recursion (all possible combinations of letter)

public class JAVA55PERMUTATION {
    public static void permut(String str,String prm)
    {
        if(str.length()==0)
        {
            System.out.println(prm);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char curr=str.charAt(i);
            String newstr=str.substring(0, i)+str.substring(i+1);
            permut(newstr, prm+curr);
        }
    }
    public static void main(String[] args) {
        String a="abc";
        permut(a, " ");
    }
}
