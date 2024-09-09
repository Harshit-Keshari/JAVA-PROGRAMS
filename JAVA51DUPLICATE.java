public class JAVA51DUPLICATE {
    
    public static boolean[] map=new boolean[26];

    public static void duplicate(String str,int idx,String newStr){

        if(idx==str.length())
        {
            System.out.println(newStr);
            return;
        }
        char currentChar=str.charAt(idx);
        if(map[currentChar-'a']==true)
        {
            duplicate(str, idx+1, newStr);
        }
        else
        {
            newStr += currentChar;
            map[currentChar-'a']=true;
            duplicate(str, idx+1, newStr);
        }
    }
    public static void main(String[] args) {
        String a="harshitkeshari";
        duplicate(a, 0, " ");
    }
    
}
