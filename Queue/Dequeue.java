package Queue;

public class Dequeue
{
    int[] queue;
    int front;
    int rear;
    int capacity;
    int size;

    public Dequeue(int capacity)
    {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = -1;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty()
    {
        return size==0;
    }

    public boolean isfull()
    {
        return size==capacity;
    }

    public void insertFront(int data)
    {
       if(isfull())
       {
          System.out.println("Dequeue is full. Cannot insert at front.");
          return;
       }
       if(isEmpty())
       {
           front =0;
           rear = 0;
       }
       else if(front ==0)
          front = capacity - 1;
       else
           front--;
       queue[front] = data;
       size++;
    }

    public void insertRear(int data)
    {
        if(isfull())
        {
            System.out.println("Dequeue is full. Cannot insert at rear.");
            return;
        }
        if(isEmpty())
        {
            front=0;
            rear=0;
        }
        else if(rear ==capacity - 1)
            rear = 0;
        else
            rear++;

        queue[rear] = data;
        size++;
    }


    public void deleteFront()
    {
        if(isEmpty())
        {
            System.out.println("Dequeue is empty. Cannot delete from front.");
            return;
        }
        int data = queue[front];
        if(front ==rear)
        {
            front = -1;
            rear = -1;
        }
        else if(front == capacity - 1)
            front = 0;
        else
            front++;
        size--;
        System.out.println("Deleted from front: " + data);
    }

    public void deleteRare()
    {
        if (isEmpty())
        {
            System.out.println("Dequeue is empty. Cannot delete from rear.");
            return;
        }
        int data = queue[rear];
        if(front==rear)
        {
            front = -1;
            rear = -1;
        }
        else
        {
         if(rear==0)
             rear = capacity - 1;
         else
             rear--;
        }
        size--;
        System.out.println("Deleted from rear: " + data);
    }

    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Dequeue is empty.");
            return;
        }
        System.out.print("Dequeue elements: ");
        for (int i = 0; i < size; i++)
        {
            int index = (front + i) % capacity;
            System.out.print(queue[index] + " ");
        }
        System.out.println();
    }
}
