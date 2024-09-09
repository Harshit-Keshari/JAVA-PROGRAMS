
// calculate height x^n 

// public class JAVA45RECURSION {
//     public static int pow(int x,int n)
//     {
//         if(n==0)
//         {
//             return 1;
//         }
//         if(x==0)
//         {
//             return 0;
//         }
//         int pownm1=pow(x,n-1);
//         int pown=x*pownm1;
//         return pown;
//     }
//     public static void main(String[] args) {
//         int x=2,n=5;
//         int ans=pow(x, n);
//         System.out.println("Power is: "+ans);
//     }
// }



// calculate height logn


public class JAVA45RECURSION {
    public static int pow(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        if(x==0)
        {
            return 0;
        }
        
        // if n is even

        if(n%2 ==0)
        {
            return pow(x,n/2) *pow(x,n/2);
        }
        else
        {
            return pow(x,n/2)*pow(x,n/2)*x; 
        }
    }
    public static void main(String[] args) {
        int x=2,n=5;
        int ans=pow(x, n);
        System.out.println("Power is: "+ans);
    }

    
}
