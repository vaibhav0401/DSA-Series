package Array;

import java.util.HashSet;
import java.util.Set;

public class ArrayUnion
{
   public static int[] getArraysUnion(int[] arr1, int[] arr2)
   {
      Set<Integer> set = new HashSet<>();

      for(int ele : arr1)
          set.add(ele);
      for(int ele: arr2)
         set.add(ele);
      int[] res = new int[set.size()];
      int i=0;
      for(int ele : set)
         res[i++] = ele;

      return res;
   }
}
