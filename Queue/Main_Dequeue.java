package Queue;

public class Main_Dequeue
{
    public static void main(String[] args)
    {
        Dequeue dequeue = new Dequeue(5);
        dequeue.insertRear(10);
        dequeue.insertRear(20);
        dequeue.display();
        dequeue.insertFront(5);
        dequeue.display();
        dequeue.insertRear(30);
        dequeue.display();
        dequeue.insertFront(2);
        dequeue.display();
        dequeue.insertRear(40);
        dequeue.display();

        dequeue.deleteFront();
        dequeue.display();
        dequeue.deleteRare();
        dequeue.display();
        dequeue.insertFront(1);
        dequeue.display();
        dequeue.insertRear(50);
        dequeue.display();

    }
}
