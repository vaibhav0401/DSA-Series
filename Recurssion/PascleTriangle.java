package Recurssion;

public class PascleTriangle
{
   public static void main(String[] args)
   {
      int n=5;
      int i=0;
      while(i<=n)
      {
            for(int j=0; j<=i; j++)
            {
                System.out.print(getRecurssiveNcR(i, j) + " ");
            }
            System.out.println();
            i++;
      }
   }
   public static int getFactorial(int n)
   {
      if(n==0|| n==1)
         return 1;
      return n*getFactorial(n-1);
   }
   public static int getRecurssiveNcR(int n, int r)
   {
      if(n==0 || r==0 || n==r)
         return 1;
      if(r>n)
            return 0;
      return getRecurssiveNcR(n-1, r-1) + getRecurssiveNcR(n-1, r);
   }
}
