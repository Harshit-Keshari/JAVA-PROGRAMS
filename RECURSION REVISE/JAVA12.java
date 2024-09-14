// move all x in last

public class JAVA12 {
    public static void move(String str,int idx,int count,String newstr)
    {
        if(idx==str.length())
        {
            for(int i=0;i<count;i++)
            {
                newstr+='x';
            }
            System.out.println(newstr);
            return;
        }
        char current=str.charAt(idx);
        if(current == 'x')
        {
            count++;
            move(str, idx+1, count, newstr);
        }
        else
        {
            newstr +=current;
            move(str, idx+1, count, newstr);
        }
    }
    public static void main(String[] args) {
        String a="axbxxcdxex";
        move(a, 0, 0, " ");
    }
}
