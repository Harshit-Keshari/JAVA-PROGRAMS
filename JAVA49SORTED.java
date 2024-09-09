public class JAVA49SORTED {
     public static boolean isSort(int arr[],int idx){
        if(idx==arr.length-1)
        {
            return true;
        }
        if(arr[idx]<arr[idx+1])
        {
            return isSort(arr,idx+1);
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,8,9,12,15};
        System.out.println(isSort(a, 0));
    }
}
