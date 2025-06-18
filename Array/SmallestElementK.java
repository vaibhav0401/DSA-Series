package Array;

import java.util.Collections;
import java.util.PriorityQueue;

public class SmallestElementK
{
   public static int getSmallestElement(int[] arr, int k)
   {
      PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());
      for(int num: arr)
      {
         minHeap.add(num);
         if(minHeap.size()>k)
            minHeap.poll();
      }
      return minHeap.peek();
   }
}
