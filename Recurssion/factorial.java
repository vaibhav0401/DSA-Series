package Recurssion;

public class factorial
{
   public static int getFactorial(int n)
   {
      if(n==0|| n==1)
         return 1;
      return n*getFactorial(n-1);
   }
}
