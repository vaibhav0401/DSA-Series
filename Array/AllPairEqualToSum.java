package Array;

import java.util.*;

public class AllPairEqualToSum
{
   public static List<List<Integer>>getAllPairs(int[] arr, int target)
   {
      List<List<Integer>> result = new ArrayList<>();
      Set<Integer> set = new HashSet<>();
      for(int ele : arr)
      {
         int complement = target-ele;
         if(set.contains(complement))
         {
            result.add(Arrays.asList(ele, complement));
         }
         set.add(ele);
      }
      return result;
   }
}
