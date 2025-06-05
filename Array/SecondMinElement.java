package Array;

public class SecondMinElement
{
   public static int getSecondMinElement(int[] arr)
   {
      if(arr.length<2)
      {
         throw new IllegalArgumentException("Array must contain at least two elements.");
      }
      int min= Integer.MAX_VALUE;
      int secondMin = Integer.MAX_VALUE;

      for(int ele : arr)
      {
         if(ele<min){
            secondMin = min;
            min = ele;
         }
         else if(ele<secondMin && ele!=min)
         {
            secondMin= ele;
         }
      }
      return secondMin;
   }
}
