package Array;

class MaxElement{

   public static int getMaxElement(int[] arr){
      int maxElement = arr[0];
      for(int ele:arr){
         if(ele>maxElement)
            maxElement = ele;
      }
      return maxElement;
   }
}