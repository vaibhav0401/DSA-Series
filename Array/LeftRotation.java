package Array;

public class LeftRotation
{
   public static int[] leftRotate(int[] arr, int k)
   {
      int n = arr.length;
      k=k%n;

      reverse(arr, 0, k-1);
      reverse(arr, k,n-1);
      reverse(arr,0,n-1);

      return arr;
   }
   private static void reverse(int[] arr, int start, int end)
   {
      while(start<end)
      {
         int temp= arr[start];
         arr[start++]= arr[end];
         arr[end--]= temp;
      }
   }
}
