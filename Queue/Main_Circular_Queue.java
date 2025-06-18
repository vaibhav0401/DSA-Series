package Queue;

public class Main_Circular_Queue
{
    public static void main(String[] args)
    {
        CircularQueue queue = new CircularQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();
        queue.peek();
        queue.dequeue();
        queue.display();
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70);
        queue.display();
        queue.dequeue();
        queue.peek();
        queue.enqueue(80);
        queue.display();


    }
}
