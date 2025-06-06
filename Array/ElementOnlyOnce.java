package Array;

import java.util.HashMap;
import java.util.Map;

public class ElementOnlyOnce
{
   public static int getElementOnlyOnce(int[] arr)
   {
      if(arr==null || arr.length == 0)
      {
         throw new IllegalArgumentException("Array must contain at least one element.");
      }
      int result =0;
      Map<Integer, Integer> map = new HashMap<>();
      for(int ele: arr)
         map.put(ele,map.getOrDefault(ele,0)+1);

      for(Map.Entry<Integer,Integer> entry : map.entrySet())
      {
         if(entry.getValue()==1)
         {
            result = entry.getKey();
            break;
         }
      }
      return result;
   }
}
