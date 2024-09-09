public class JAVA50MOVE {
    public static void move(String str,int idx,int count,String newStr)
    {
        if(idx==str.length())
        {
            for(int i=0;i<count;i++)
            {
                newStr+='x';
            }
            System.out.println(newStr);
            return;
        }
        char currentChar=str.charAt(idx);
        if(currentChar=='x')
        {
            count+=1;
            move(str, idx+1, count, newStr);
        }
        else
        {
            newStr+=currentChar;
            move(str, idx+1, count, newStr);
        }
    }
    public static void main(String[] args) {
        String s="axbcxxd";
        move(s, 0, 0, "");
    }
    
}
