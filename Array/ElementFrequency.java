package Array;

import java.util.HashMap;
import java.util.Map;

public class ElementFrequency
{
   public static Map<Integer, Integer> getElementFrequency(int[] arr)
   {
      if (arr.length == 0)
      {
         throw new IllegalArgumentException("Array must not be empty.");
      }

      Map<Integer, Integer> map= new HashMap<>();
      for(int ele : arr)
      {
         map.put(ele, map.getOrDefault(ele,0)+1);
      }
      return map;
   }
}
