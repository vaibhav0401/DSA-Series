package Array;

import java.util.*;

public class SubArraySumEqualToK
{
   public static  List<List<Integer>> getSubArray(int[] arr, int k)
   {
      int sum=0;
      List<List<Integer>>  subArrays = new ArrayList<>();

      Map<Integer,Integer> map = new HashMap<>();
      for(int i=0;i<arr.length;i++)
      {
         sum+=arr[i];
         if(map.containsKey(sum-k))
         {
            List<Integer> sub = new ArrayList<>();
            int startIndex = map.get(sum - k)+1;
            while(startIndex<=i)
               sub.add(arr[startIndex++]);
            subArrays.add(sub);
         }
         map.put(sum, i);
      }
      return subArrays;
   }
}
