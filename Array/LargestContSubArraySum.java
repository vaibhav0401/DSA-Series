package Array;
//Kadane's Algo
public class LargestContSubArraySum
{
   public static int largestContiguousSubArraySum(int[] arr)
   {
      int maxSum= Integer.MIN_VALUE;
      int currSum=arr[0];
      for(int i=1;i<arr.length;i++)
      {
         currSum+=arr[i];
         maxSum= Math.max(maxSum,currSum);
         if(currSum < 0)
         {
            currSum = 0; // Reset current sum if it becomes negative
         }
      }
      return maxSum;
   }

}
