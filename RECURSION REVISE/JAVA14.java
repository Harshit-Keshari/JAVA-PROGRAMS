// print the subsequences of a string

public class JAVA14 {
    static void subse(String str,int idx,String newstr)
    {
        if(idx==str.length())
        {
            System.out.println(newstr);
            return;
        }
        char curr=str.charAt(idx);

        subse(str, idx+1, (newstr+curr));
        subse(str, idx+1, newstr);
    }
    public static void main(String[] args) {
        String a="abc";
        subse(a, 0, " ");
    }
}
