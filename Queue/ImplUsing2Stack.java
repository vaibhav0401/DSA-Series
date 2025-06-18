package Queue;

import java.util.Stack;

public class ImplUsing2Stack
{

   //Stack1 for enqueue
   //Stack2 for dequeue

   private Stack<Integer> stack1;
   private Stack<Integer> stack2;
   private int size;

   public ImplUsing2Stack(int size)
   {
      this.size = size;
      stack1 = new Stack();
      stack2 = new Stack();
   }

   public void enqueue(int data)
   {
      if (stack1.size() == size)
      {
         System.out.println("Queue is full. Cannot enqueue " + data);
         return;
      }
      stack1.push(data);
   }

   public int dequeue()
   {
      if(stack1.empty() && stack2.empty())
      {
         System.out.println("Queue is empty. Cannot dequeue.");
         return -1;
      }
      if(stack2.empty())
      {
         while (!stack1.empty())
            stack2.push(stack1.pop());
      }
      return stack2.pop();
   }

   public int peek()
   {
      if(stack1.empty() && stack2.empty())
      {
         System.out.println("Queue is empty. Cannot dequeue.");
         return -1;
      }
      if(stack2.empty())
      {
         while (!stack1.empty())
            stack2.push(stack1.pop());
      }
      return stack2.peek();
   }
    public boolean isEmpty()
    {
        return stack1.empty() && stack2.empty();
    }
}
