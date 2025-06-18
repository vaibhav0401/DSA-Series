package Array;

import javax.lang.model.type.ArrayType;
import java.util.*;

public class SortBasedOnFrequency
{
   public static List<Integer> getSortedArray(List<Integer> arr)
   {
      Map<Integer,Integer> map = new HashMap<>();
      for(int ele: arr)
         map.put(ele,map.getOrDefault(ele,0)+1);
      Collections.sort(arr,(n1,n2)-> {
         if(map.get(n1)!=map.get(n2))
            return map.get(n2)- map.get(n1);
         return n1 - n2;
      });

      return arr;
   }
}
