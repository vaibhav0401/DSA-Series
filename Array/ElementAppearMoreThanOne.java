package Array;

public class ElementAppearMoreThanOne
{
   public static int getElementAppearMoreThanOne(int[] arr)
   {
      int slow =0, fast =0;
      do{
         slow = arr[slow];
         fast = arr[arr[fast]];
      }while(slow!=fast);

      slow =0;
      while(slow!=fast)
      {
         slow = arr[slow];
         fast = arr[fast];
      }
      return slow;
   }
}
