package Array;

public class AlternateElements
{
   public static int[] alternateElements(int[] arr)
   {
      int[] result = new int[arr.length / 2 + arr.length % 2 ];
      int index =0;
      while(index< arr.length)
      {
         result[index / 2] = arr[index];
         index += 2;
      }
      return result;
   }
}
