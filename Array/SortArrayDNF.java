package Array;

public class SortArrayDNF
{
   public static int[] sortArray(int[] arr)
   {
      if(arr == null || arr.length == 0)
         return new int[0];
      int low = 0, mid = 0, high = arr.length - 1;
      while(mid<=high)
      {
         if (arr[mid] == 0)
         {
            swap(arr, low, mid);
            low++;
            mid++;
         }
         else if (arr[mid] == 1)
            mid++;
         else
         {
            swap(arr,mid,high);
            high--;
         }
      }

      return arr;
   }

   private static void swap(int[] arr, int i, int j)
   {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
   }
}
