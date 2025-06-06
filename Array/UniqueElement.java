package Array;

public class UniqueElement
{
   public static int[] getUniqueElements(int[] arr)
   {
      if(arr == null || arr.length ==0)
         return new int[0];
      int n = arr.length;
      int seen = 0;
      for(int i=1;i<n;i++)
      {
         if(arr[seen]!=arr[i])
         {
            seen++;
            arr[seen] = arr[i];
         }
      }
      int[] res = new int[seen+1];
      for(int i=0;i<=seen;i++)
         res[i] = arr[i];
      return res;
   }
}
