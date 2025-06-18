package Queue;

public class Main_SimpleQueue
{
   public static void main(String[]  args)
   {
      SimpleQueue queue = new SimpleQueue(5);
      queue.enqueue(10);
      queue.enqueue(20);
      queue.enqueue(30);
      queue.peek();
      queue.display();
     queue.dequeue();
     queue.peek();
     queue.display();
     queue.enqueue(40);
      queue.display();
     queue.enqueue(50);
      queue.display();
   queue.enqueue(60); // This should show "Queue is full"
     queue.display();



      ImplUsing2Stack implUsing2Stack = new ImplUsing2Stack(5);
        implUsing2Stack.enqueue(10);
        implUsing2Stack.enqueue(20);
        System.out.println("Front element: " + implUsing2Stack.peek());
        implUsing2Stack.enqueue(30);
        System.out.println("Front element: " + implUsing2Stack.peek());
      System.out.println("Front element: " +implUsing2Stack.dequeue());
      System.out.println("Front element: " + implUsing2Stack.peek());




   }
}
