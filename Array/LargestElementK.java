package Array;

import java.util.PriorityQueue;

public class LargestElementK
{
   public static int findLargestElement(int[] arr, int k)
   {
      PriorityQueue<Integer> minHeap = new PriorityQueue<>();

      for(int ele: arr)
      {
         minHeap.add(ele);
         if(minHeap.size()>k)
            minHeap.poll();
      }
      return minHeap.peek();
   }
}
