package Algorithms.SlowFastPointer;

import LinkedList.Singly.Node;

//Slow and Fast pointer
public class DetectCycle
{

   public static Node hasCycle(Node head)
   {
      Node slow= head;
      Node fast = head;

      while(fast!=null && fast.next!=null)
      {
         slow= slow.next;
         fast= fast.next.next;
         if(slow==fast)break;
      }
      slow = head;
      while(slow!=fast)
      {
         slow= slow.next;
         fast= fast.next;
      }
       return slow;
   }

   public static void main(String[] args)
   {
      Node head = new Node(1);
      head.next = new Node(2);
      head.next.next = new Node(3);
      head.next.next.next = new Node(4);
      head.next.next.next.next = new Node(5);
      head.next.next.next.next.next = new Node(6);
      head.next.next.next.next.next.next = head.next.next.next.next; // Creating a cycle

      Node cycleNode = hasCycle(head);
      if (cycleNode != null)
      {
         System.out.println("Cycle detected at node with value: " + cycleNode.data);
      }
      else
      {
         System.out.println("No cycle detected.");
      }
   }
}
