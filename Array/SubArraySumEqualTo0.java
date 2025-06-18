package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubArraySumEqualTo0
{
   public static List<List<Integer>>  getSubArray(int[] arr, int k)
   {
      List<List<Integer>>  subArrays = new ArrayList<>();
      int sum = 0;
      int startindex = 0;
      for(int i=0;i< arr.length;i++){
         sum+=arr[i];
         if(sum==0) {
            List<Integer> subArray = new ArrayList<>();
            while(startindex<=i)
               subArray.add(arr[startindex++]);
            subArrays.add(subArray);
         }
      }
      return subArrays;
   }
}
