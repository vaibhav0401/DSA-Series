package Stack;

public class Stack_Array
{
   private static int[] array;
   private static int maxSize;
   private static int top=-1;

   public Stack_Array(int size)
   {
      this.maxSize = size;
      this.array = new int[size];
      this.top =-1;
   }

   public static void push(int data)
   {
      if(top == maxSize-1)
         System.out.println("Stack is full ");
      else
         array[++top] = data;
   }

   public static void pop()
   {
      if(top==-1)
            System.out.println("Stack is empty");
        else
        {
            System.out.println("Popped element: " + array[top]);
            top--;
        }
   }

   public static void peek()
   {
      if(top==-1)
         System.out.println("Stack is empty");
      else
         System.out.println("Top element: " + array[top]);
   }

   public static void display()
   {
      if(top ==-1)
         System.out.println("Stack is empty");
      else
      {
         for(int i=0;i<=top;i++)
         {
            System.out.print(array[i] + " ");
         }
      }
      System.out.println( " ");
   }
}
