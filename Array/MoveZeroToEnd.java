package Array;

public class MoveZeroToEnd
{
   public static int[] moveZeroesToEnd(int[] arr)
   {
      if(arr == null || arr.length == 0)
      {
         return arr;
      }
      int n = arr.length;
      int i=0,j=n-1;
      while(i<j)
      {
         if(arr[i] ==0 && arr[j]!=0){
            int temp =  arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
         }
         else if(arr[i] !=0 && arr[j] ==0){
            j--;
         }
         else if(arr[i] ==0 && arr[j] ==0){
            j--;
         }
         else{
            i++;
         }
      }
      return arr;
   }
}