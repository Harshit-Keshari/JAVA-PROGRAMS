import java.util.*;
public class JAVA1431LEETCODE {

        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            ArrayList<Boolean> result=new ArrayList<>();
            int maxCount=0;
            for(int i=0;i<candies.length;i++){
                if(candies[i]>maxCount){
                    maxCount=candies[i];
                }
                
            }
            for(int j=0;j<candies.length;j++){
                    if((extraCandies+candies[j])>=maxCount){
                         result.add(true);
                    }
                    else{
                        result.add(false);
                }
            }
            return result;
        }
        public static void main(String[] args) {
            // code of test case 
        }
}
