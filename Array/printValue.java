package Array;

public class printValue
{
   public static void print(int value)
   {
        System.out.print(" "+value);
   }

   public static void print(String msg,int value){
      System.out.println(msg+" : "+value);
   }

   public static void print(String msg,boolean value){
      System.out.println(msg+" : "+value);
   }

   public static void printArray(String msg, int[] arr){
      System.out.print(msg + " : ");
      for(int ele : arr)
      {
         System.out.print(ele + " ");
      }
   }
}
