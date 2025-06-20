package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGratestElement
{
   public static int[]  nextGreaterElement(int[] nums1, int[] nums2)
   {
      Map<Integer, Integer> map = new HashMap();
      for (int i = 0; i < nums2.length; i++)
         map.put(nums2[i], i);

      for (int i = 0; i < nums1.length; i++)
      {
         int ans = -1;
         if (map.containsKey(nums1[i]))
         {
            int val = map.get(nums1[i]);
            while(val<nums2.length)
            {
               if((val+1<nums2.length) && (nums2[val+1]>nums1[i]))
                  ans = nums2[val+1];
            }
            if((val+1<nums2.length) && (nums2[val+1]>nums1[i]))
               ans = nums2[val+1];
         }
         nums1[i]= ans;
      }
      return nums1;
   }

}