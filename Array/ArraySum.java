package Array;

public class ArraySum
{
   public static int sum(int[] arr)
   {
      int sum=0;
      for(int ele : arr)
      {
         sum+=ele;
      }
      return sum;
   }
}
