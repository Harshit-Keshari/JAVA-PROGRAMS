public class JAVA54KEYPAD {
    public static String[] key={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void combination(String str,int idx,String combo)
    {
        if(idx==str.length())
        {
            System.out.println(combo);
            return;
        }

        char current=str.charAt(idx);
        String map=key[current-'0'];

        for(int i=0;i<map.length();i++)
        {
            combination(str, idx+1, combo+map.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str="23";
        combination(str, 0,"");
    }
}
