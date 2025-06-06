package Array;

public class BinarySearch
{
   public static int binarySearch(int[] arr, int target)
   {
      if(arr==null || arr.length == 0)
         throw new IllegalArgumentException("Array must not be empty.");
      int left = 0, right = arr.length - 1;
      while(left<=right)
      {
         int mid = left + (right - left) / 2;
         if(arr[mid]==target)
            return mid;
         else if(arr[mid]<target)
            left = mid+1;
         else
            right = mid-1;
      }
      return -1;
   }
}
