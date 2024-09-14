// check the array is sorted or not

public class JAVA11 {
    public static boolean issorted(int[] a,int idx)
    {
        if(idx==a.length-1)
        {
            return true;
        }
        if(a[idx]<a[idx+1])
        {
            return issorted(a, idx+1);
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,12,34,56,78};
        int arr2[]={4,32,56,3,12,5,21,6,2,560};
        boolean a=issorted(arr, 0);
        boolean b=issorted(arr2, 0);
        System.out.println(a);
        System.out.println(b);
    }    
}
