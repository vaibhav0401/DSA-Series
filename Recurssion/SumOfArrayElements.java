package Recurssion;

public class SumOfArrayElements
{
   public static int getArraySum(int[] arr, int n)
   {
      if(n==0)
         return 0;
      return arr[n-1]+ getArraySum(arr,n-1);
   }
}
