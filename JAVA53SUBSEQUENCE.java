import java.util.HashSet;

public class JAVA53SUBSEQUENCE {
    public static void subsequence(String str,int idx,String newStr,HashSet<String> set)
    {
        //base condn

        if(idx==str.length())
        {
            if(set.contains(newStr))
            {
                return;
            }
            else
            {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }

        char current=str.charAt(idx);

        // to be 
        subsequence(str, idx+1, newStr+current, set);

        // not to be

        subsequence(str, idx+1, "", set);
    }
    public static void main(String[] args) {
        String str="aaa";

        HashSet<String> set=new HashSet<>();
        subsequence(str, 0, "", set);
    }
}
