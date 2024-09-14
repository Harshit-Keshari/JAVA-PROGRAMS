// TOWER OF HANOI S->START A->AUXILLARY D-> DESTINATION

public class JAVA08 {
    public static void TOH(int n,char S,char A,char D)
    {
        if(n==1)
        {
            System.out.println(n +" From "+S+" to "+D);
        }
        else
        {
            TOH(n-1,S,D,A);
            System.out.println(n +" From "+S+" to "+D);
            TOH(n-1,A,S,D);
        }
    }
    public static void main(String[] args) {
        int n=3;
        char source='A';
        char aux='B';
        char dest='C';
        TOH(n, source, aux, dest);

    }
}
