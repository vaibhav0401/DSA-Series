package Array;

public class MajorityElementMooresAlgo
{
   public static int getMajoritElement(int[] arr)
   {
      int count=0;
      int ans =0;

      for(int ele : arr)
      {
         if(count==0)
            ans = ele;
         if(ele == ans)
            count++;
         else
            count--;
      }

      //verify
      for(int ele : arr)
         if(ele==ans)
            count++;
      return (count>arr.length/2)?ans:-1;
   }
}
