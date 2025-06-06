package Array;

public class MissingNumber
{
   public static int findMissingNumber(int[] arr)
   {
      if(arr==null || arr.length == 0)
      {
         throw new IllegalArgumentException("Array must not be empty.");
      }
      int n= arr[arr.length-1];
      int totalSum =  (n*(n+1))/2;
      int actualSum = 0;
      for(int ele: arr)
         actualSum+=ele;

      return totalSum-actualSum;
   }
}
