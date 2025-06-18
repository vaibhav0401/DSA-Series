package Queue;

public class CircularQueue
{
   private int[] queue;
   private int front;
   private int rare;
   private int capacity;
   private int size;

   public CircularQueue(int capacity)
   {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rare = -1;
        this.size = 0;
   }

   public void enqueue(int data)
   {
     if(size >= capacity)
     {
        System.out.println("Queue is full");
        return;
     }
     rare = (rare+1)% capacity;
     queue[rare] = data;
     size++;
   }

   public void dequeue()
   {
      if(size == 0)
      {
         System.out.println("Queue is empty");
         return;
      }
      System.out.println("Removed from Queue : " + queue[front]);
      front = (front+1)%capacity;
      size--;
   }

   public void peek()
   {
      if(size==0)
         System.out.println("Queue is empty");
      else
         System.out.println("Front element in Queue : " + queue[front]);
   }

   public void display()
   {
      if(size==0)
      {
          System.out.println("Queue is empty");
          return;
      }
      else
      {
         System.out.print("Queue elements: ");
         for(int i = 0; i < size; i++)
         {
            System.out.print(queue[(front + i) % capacity] + " ");
         }
         System.out.println();
      }
   }
   public int size()
   {
      return this.size;
   }
}
