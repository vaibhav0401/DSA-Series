package Queue;

public class SimpleQueue
{
   private int[] queue;
   private int front;
   private int rare;
   private int capacity;

   public SimpleQueue(int size)
   {
      this.capacity = size;
      this.queue = new int[capacity];
      this.front = 0;
      this.rare = -1;
   }

   // Insert data
   public void enqueue(int data)
   {
      if(rare ==capacity-1)
      {
         System.out.println("Queue is full");
         return;
      }
      queue[++rare] = data;
      System.out.println("Inserted in Queue : " + data);
   }

   // Remove data

   public void dequeue()
   {
      if(front>rare)
         System.out.println("Queue is empty");
      else
         System.out.println("Removed from Queue : " + queue[front++]);
   }


   // Peek data

   public void peek()
   {
      if(front > rare)
      {
         System.out.println("Queue is empty");
         return;
      }
      System.out.println("Front element in Queue : " + queue[front]);
   }

   // Display all elements in the queue

   public void display()
   {
      if(front>rare)
         System.out.println("Queue is empty");
        else
        {
          System.out.print("Queue elements: ");
          int i = front;
          while(i<=rare)
             System.out.print(queue[i++] + " ");

             System.out.println();
        }
   }
}
