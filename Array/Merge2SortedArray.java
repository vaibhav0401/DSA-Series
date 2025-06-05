package Array;

public class Merge2SortedArray
{
   public static int[] mergeSortedArray(int arr1[], int arr2[])
   {
      int len1 = arr1.length;
      int len2 = arr2.length;
      int[] result = new int[len1+len2];
      int i=0,j=0,k=0;
      while(i<len1 && j<len2)
      {
         if(arr1[i]< arr2[j])
            result[k++]= arr1[i++];
         else
            result[k++]= arr2[j++];
      }
      while(i<len1)
        result[k++] = arr1[i++];
      while(j<len2)
         result[k++]= arr2[j++];

      return result;
   }
}
