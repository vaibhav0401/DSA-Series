package LinkedList.Circular;

public class Operations
{
   static Node head;
   static Node tail;

   public static void addFront(int data)
   {
      Node newNode  = new Node(data);

      if(head == null)
      {
         head=newNode;
         tail=newNode;
         head.next=head;
         head.prev=head;
      }
      else {
         newNode.next=head;
         newNode.prev=tail;
         head.prev=newNode;
         tail.next=newNode;
         head = newNode;
      }
   }

   public static void addEnd(int data)
   {
      Node newNode = new Node(data);
      if(tail==null)
      {
         head = newNode;
         tail = newNode;
         head.next=head;
         head .prev=head;
      }
      else
      {
         newNode.prev=tail;
         newNode.next=head;
         tail.next = newNode;
         head.prev = newNode;
         tail = newNode;
      }
   }


   public static void deleteFront()
   {
      if(head==null)
         throw new RuntimeException("List is empty");
      if(head==tail)
      {
         head = null;
         tail=null;
      }
      else {
         head= head.next;
         tail.next= head;
         head.prev =tail;
      }
   }

   public static void deleteEnd()
   {
      if(head==null)
         throw new RuntimeException("List is empty");
      if(head==tail)
      {
         head = null;
         tail=null;
      }
      else {
         tail = tail.prev;
         tail.next=head;
         head.prev= tail;
      }
   }

   public static void displayForward()
   {
      System.out.println("-------Display Forward------");
      if(head == null)
      {
         System.out.println("List is empty");
         return;
      }
      Node curr = head;
     do
      {
         System.out.print(curr.data + " => " );
         curr = curr.next;
      } while(curr!=head);
      System.out.println("null");
   }

   public static void displayBackward()
   {
      System.out.println("-------Display Backward------");
      if(tail == null)
      {
         System.out.println("List is empty");
         return;
      }
      Node curr = tail;
      do
      {
         System.out.print(curr.data + " => ");
         curr = curr.prev;
      }while(curr!=tail);
      System.out.println("null");
   }
}

