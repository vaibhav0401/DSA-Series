package Recurssion;

public class NcR
{
   public static void main(String[] args)
   {
      int n=3;
      System.out.println("The value of nCr for n = " + n + " and r = 2 is : " + ncr(n, 2));


   }

   public static int factorial(int n)
   {
      if( n==0|| n==1)
         return 1;
      return n*factorial(n-1);
   }
   public static int ncr(int n, int r)
   {
      if(r>n || r<0)
         return 0;
      return factorial(n) / (factorial(r) * factorial(n - r));
   }
}
