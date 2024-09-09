public class JAVA48OCCUR {
    public static int first=-1;
    public static int last=-1;

    public static void occ(String str,int idx,char element)
    {
        if(idx==str.length())
        {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char current=str.charAt(idx);
        if(current==element)
        {
            if(first==-1)
            {
                first=idx;
            }
            else
            {
                last=idx;
            }
        }
        occ(str, idx+1, element);
    }
    public static void main(String[] args) {
        String str="harshitkeshari";
        occ(str, 0,'h');
    }
    
}
