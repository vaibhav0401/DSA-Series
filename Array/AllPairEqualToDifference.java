package Array;

import java.util.*;

public class AllPairEqualToDifference
{
   public static List<List<Integer>> getAllPairsEqualToDifference(int[] arr, int k)
   {
      List<List<Integer>> result = new ArrayList<>();
      Set<Integer> set = new HashSet<>();
      for(int ele:arr)
      {

         if(set.contains(ele-k))
         {
           result.add(Arrays.asList(ele, ele-k));
         }
         if(set.contains(ele+k))
         {
            result.add(Arrays.asList(ele, ele+k));
         }
         set.add(ele);
      }
      return result;
   }
}