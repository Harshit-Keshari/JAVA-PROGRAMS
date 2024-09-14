// first and last occurence

public class JAVA10 {
    public static int first=-1;
    public static int last=-1;

    public static void occ(String str,char ele,int idx){
        if(idx == str.length())
        {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char current = str.charAt(idx);
        if(current == ele)
        {
            if(first==-1)
            {
                first=idx;
            }
            last=idx;
        }
        occ(str,ele,idx+1);
    }
    public static void main(String[] args) {
        String a="HARSHIT";
        occ(a, 'H', 0);
    }
}
