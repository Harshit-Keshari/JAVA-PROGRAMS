public class JAVA52SUBSEQUENCES {
    public static void subsequence(String str,int idx,String newStr)
    {
        if(idx==str.length())
        {
            System.out.println(newStr);
            return;
        }
        char current=str.charAt(idx);
        // want to include
        subsequence(str, idx+1, newStr+current);
        // not want to include
        subsequence(str, idx+1, newStr);

    }
    public static void main(String[] args) {
        String a="abc";
        subsequence(a, 0, "");
    }
}
