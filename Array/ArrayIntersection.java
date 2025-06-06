package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArrayIntersection
{
   public static int[] getArraysIntersection(int[] arr1, int[] arr2)
   {
      HashMap<Integer, Integer>  map = new HashMap<>();
      List<Integer> result = new ArrayList<>();
      if(arr1.length == 0 || arr2.length == 0)
      {
         throw new IllegalArgumentException("Both arrays must not be empty.");
      }
      for(int ele :  arr1)
         map.put(ele, map.getOrDefault(ele, 0)+1);

      for(int ele : arr2)
      {
         if(map.containsKey(ele) && map.get(ele)>0)
         {
            result.add(ele);
            map.put(ele, map.get(ele)-1); // Decrease the count to avoid duplicates in intersection
         }
      }
      for(int ele : result)
      {
         if(map.containsKey(ele) && map.get(ele) > 0)
         {
            map.put(ele, map.get(ele)-1); // Decrease the count to avoid duplicates in intersection
         }
      }
      int[] output =  new int[result.size()];
      for(int i=0;i<result.size();i++)
         output[i] = result.get(i);
      return output;
   }
}
