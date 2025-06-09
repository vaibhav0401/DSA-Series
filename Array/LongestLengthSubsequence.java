package Array;

import java.util.HashMap;
import java.util.Map;

public class LongestLengthSubsequence
{
   public static int longestLengthSubsequence(int[] arr)
   {
      if(arr == null || arr.length == 0)
         return 0;
      int LargestLength = 0;
      Map<Integer,Boolean> map= new HashMap<>();
      for(int ele : arr)
             map.put(ele, Boolean.FALSE);

      for(int ele: arr)
      {
         int currentLength = 1;
         int nextEle = ele + 1;
         while(map.containsKey(nextEle) && map.get(nextEle) == Boolean.FALSE)
         {
            currentLength++;
            map.put(nextEle, Boolean.TRUE);
            nextEle++;
         }
         int prevEle = ele - 1;
         while(map.containsKey(prevEle) && map.get(prevEle) == Boolean.FALSE)
         {
            currentLength++;
            map.put(prevEle, Boolean.TRUE);
            prevEle--;
         }
         LargestLength = Math.max(LargestLength, currentLength);
      }


      return LargestLength;
   }
}
