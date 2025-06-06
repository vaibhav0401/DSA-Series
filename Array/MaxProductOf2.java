package Array;

public class MaxProductOf2
{
   public static int getMaxProduct(int[] arr)
   {
      int max1= Integer.MIN_VALUE;
      int max2= Integer.MIN_VALUE;
      int min1= Integer.MAX_VALUE;
      int min2= Integer.MAX_VALUE;

      for(int ele : arr)
      {
         if(ele>max1)
         {
            max2= max1;
            max1=ele;
         }
         else if(ele>max2)
            max2=ele;

         if(min1>ele)
         {
            min2=min1;
            min1=ele;
         }
         else if(min2>ele)
            min2=ele;
      }
      return Math.max(min1*min2, max1*max2);
   }
}
