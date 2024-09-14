// print the unique subsequences of a string
import java.util.*;

public class JAVA15 {
    static void subse(String str,int idx,String newstr,HashSet<String> set)
    {
        if(idx==str.length())
        {
            if(set.contains(newstr))
            {
                return;
            }
            else
            {
                System.out.println(newstr);
                set.add(newstr);
                return;
            }
        }
        char curr=str.charAt(idx);

        subse(str, idx+1, (newstr+curr),set);
        subse(str, idx+1, newstr,set);
    }
    public static void main(String[] args) {
        String a="aaa";
        HashSet<String> s=new HashSet<>();
        subse(a, 0, " ",s);
    }
}
