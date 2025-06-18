package Recurssion;

public class Sum1toN
{
   public static int getSum(int n)
   {
      int res = 0;
     if(n==1)
        return 1;
     return n+getSum(n-1);

   }
}
