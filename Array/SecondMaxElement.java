package Array;

public class SecondMaxElement
{
   public static int getSecondMaxElement(int[] arr)
   {
      if(arr.length<2){
         throw new IllegalArgumentException("Array must contain at least two elements.");
      }
      int max1 =Integer.MIN_VALUE;
      int max2 =Integer.MIN_VALUE;
      for(int ele : arr)
      {
         if(ele>max1){
            max2=max1;
            max1= ele;
         }
         else if(ele>max2 && ele!=max1)
         {
            max2= ele;
         }
      }
      return max2;
   }
}
