package Recurssion;

public class PrintNto1
{
   public static void printBackward(int n)
   {
      if(n==0)
         return;
      System.out.print(n +" ");
      printBackward(n-1);
   }
}
