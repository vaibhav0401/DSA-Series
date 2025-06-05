package Array;

public class CountEvenOdd
{
   public static int[] countEvenOdd(int[] arr)
   {
      int evenCount = 0;
      int oddCount = 0;

      for(int ele : arr)
      {
         if(ele%2==0)
            evenCount++;
         else
            oddCount++;
      }

      return new int[]{evenCount,oddCount};
   }
}
