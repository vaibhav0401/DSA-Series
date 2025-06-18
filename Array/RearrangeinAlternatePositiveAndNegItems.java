package Array;

public class RearrangeinAlternatePositiveAndNegItems
{
   public static int[] getRearrangesArray(int[] arr)
   {
      int n = arr.length-1;
      for(int i=0;i< arr.length; i++)
      {
         if(i%2==0 && arr[i]>=0)
         {
            int j=i+1;
            while(j<n && arr[j]>=0)
               j++;
            if(j<n)
            {
               rightRotateArray(arr, i, j);
            }
         }
         else if(i%2==1 && arr[i]< 0)
         {
            int j=i+1;
            while(j<n && arr[j]<0)
               j++;

            if(j<n)
            {
              rightRotateArray(arr,i,j);
            }

         }
      }
      return arr;
   }

   private static void rightRotateArray(int[] arr, int i, int j)
   {
      int ele = arr[j];
      int m = j;
      while (m > i)
         arr[m--] = arr[i];

      arr[i] = ele;
   }
}
