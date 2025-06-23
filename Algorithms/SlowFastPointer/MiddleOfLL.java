package Algorithms.SlowFastPointer;

import LinkedList.Singly.Node;

//Slow and Fast pointer
public class MiddleOfLL
{
   public static void main(String[] args)
   {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        Node slow = head;
        Node fast = head;

       while(fast!=null && fast.next!=null)
       {
          slow= slow.next;
          fast= fast.next.next;
       }

        System.out.println("Middle of the Linked List: " + slow.data);
   }
}
