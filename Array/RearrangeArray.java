package Array;

public class RearrangeArray
{
   public static int[] rearrange(int[] arr)
   {
      if(arr == null || arr.length == 0)
         throw new IllegalArgumentException("Array must not be empty.");
     int len = arr.length-1;
      int maxElement = arr[len]+1;
      int i=0,j=0,k=len;
      while(j<=k)
      {
         if(i%2==0)
            arr[i++]+= arr[k--]%maxElement*maxElement;
         else
            arr[i++]+= arr[j++]%maxElement*maxElement;
      }

      for(i=0;i<=len;i++)
      {
         arr[i] = arr[i]/maxElement;
      }
      return arr;
   }
}
