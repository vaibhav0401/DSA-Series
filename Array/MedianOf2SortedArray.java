package Array;

public class MedianOf2SortedArray
{
   public static int getMedian(int[] arr1, int[] arr2)
   {
      int n1= arr1.length;
      int n2 = arr2.length;
      int l1,l2,r1,r2;
      int low=0;int high= n1;

      while(low<=high)
      {
         int mid1 = (low+high)/2;
         int mid2 = (n1+n2+1)/2-mid1;
         l1= mid1==0?Integer.MIN_VALUE:arr1[mid1-1];
         l2= mid2==0?Integer.MIN_VALUE:arr2[mid2-1];
         r1= mid1==n1?Integer.MAX_VALUE:arr1[mid1];
         r2=mid2==n2?Integer.MAX_VALUE:arr2[mid2];

         if(l2<=r1 && l1<=r2)
         {
            if((n1+n2)%2==0)
               return (Math.min(r1,r2)+ Math.max(l1,l2))/2;
            else
               return Math.max(l1,l2);
         }
         else if(l1>r2)
            high = mid1-1;
         else
            low= mid1+1;
      }
      return -1;
   }
}
