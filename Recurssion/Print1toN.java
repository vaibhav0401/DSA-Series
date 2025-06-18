package Recurssion;

public class Print1toN
{
   public static void printForward(int n)
   {
      if (n == 0)
         return;
      printForward(n - 1);
      System.out.print(n + " ");
   }
}
