// reverse of string using recursion


public class JAVA09 {
    public static void rev(String str,int idx)
    {
        if(idx==-1)
        {
            return;
        }
        System.out.print(str.charAt(idx));
        rev(str,idx-1);
    }
    public static void main(String[] args) {
        String a="HARSHIT KESHARI";
        rev(a,a.length()-1);
    }
}
