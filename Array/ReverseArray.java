package Array;

public class ReverseArray
{
   public static int[] reverseArray(int[] arr)
   {
      int i=0,j=arr.length-1;
      while(i<j)
      {
         int temp=arr[i];
         arr[i++] = arr[j];
         arr[j--] = temp;
      }
      return arr;
   }
}
