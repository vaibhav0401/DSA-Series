package Array;

import java.util.List;
import java.util.Map;

public class printValue
{
   public static void print(int value)
   {
        System.out.print(" "+value);
   }

   public static void print(String msg,int value){
      System.out.println(msg+" : "+value);
   }

   public static void print(String msg,List<List<Integer>> value){
      System.out.println(msg+" : "+value);
   }

   public static void printList(String msg,List<Integer> value){
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

   public static void printMap(String msg, Map<Integer, Integer> map)
   {
      System.out.println(msg+ " ");
      for(Map.Entry<Integer,Integer> mapEntry : map.entrySet())
         System.out.println("["+mapEntry.getKey() + ":" + mapEntry.getValue()+"]");
   }

   public static void printMatrix(String msg, int[][] matrix) {
      System.out.println(msg + " : ");
      for (int[] row : matrix) {
         for (int ele : row) {
            System.out.print(ele + " ");
         }
         System.out.println();
      }
   }
}
