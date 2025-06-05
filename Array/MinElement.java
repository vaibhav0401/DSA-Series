package Array;

public class MinElement
{
    public static int getMinElement(int[] arr)
   {
      int minElement = arr[0];
      for (int ele : arr)
      {
         if (ele < minElement)
            minElement = ele;
      }
      return minElement;
   }
}
