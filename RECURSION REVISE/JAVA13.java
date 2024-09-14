// remove duplicates from string

public class JAVA13 {
    public static boolean[] alpha=new boolean[26];
    public static void removeduplicates(String str,int idx,String newstr)
    {
        if(idx==str.length())
        {
            System.out.println(newstr);
            return ;
        }
        char current=str.charAt(idx);
        if(alpha[current-'a']==true)
        {
            removeduplicates(str, idx+1, newstr);
        }
        else
        {
            newstr+=current;
            alpha[current-'a']=true;
            removeduplicates(str, idx+1, newstr);
        }
    }
    public static void main(String[] args) {
        String str="harshitkeshari";
        removeduplicates(str, 0, " ");
    }
}
