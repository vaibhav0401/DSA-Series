package Stack;

public class Main_Array_Stack
{

   public static void main(String[] args)
   {
      new Stack_Array(4);
      Stack_Array.display();
      Stack_Array.push(10);
      Stack_Array.push(20);
      Stack_Array.push(30);
      Stack_Array.push(40);
      Stack_Array.display();

      Stack_Array.pop();
      Stack_Array.display();
      Stack_Array.pop();
      Stack_Array.display();

      Stack_Array.peek();


   }
}
