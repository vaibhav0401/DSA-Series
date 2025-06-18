package Recurssion;

public class Fibonacci
{
   public static int getFibonacci(int n)
   {
      if(n<=1)
         return 1;
      else
         return getFibonacci(n-1) + getFibonacci(n-2);
   }

   public static void printFibonacci(int n)
   {
     if(n==0)
        System.out.print("1 \t");
     else
        {
          int fib = getFibonacci(n);
            printFibonacci(n-1);
          System.out.print(fib + "\t");
        }
   }
}
