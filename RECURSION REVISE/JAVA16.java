// print all keypad combination

public class JAVA16 {
    public static String key[]={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void keypad(String str,int idx,String comb){
        if(idx==str.length())
        {
            System.out.println(comb);
            return;
        }
        char current=str.charAt(idx);
        String map=key[current-'0'];
        for(int i=0;i<map.length();i++)
        {
            keypad(str, idx+1, comb+map.charAt(i));
        }
    }
    public static void main(String[] args) {
        String s="23";
        keypad(s, 0, " ");
    }
}
