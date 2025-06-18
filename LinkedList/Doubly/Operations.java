package LinkedList.Doubly;

public class Operations
{
   private static Node head;
   private static Node tail;


   public static void addFront(int data)
   {
      Node newNode = new Node(data);
      if(head ==null)
      {
         head = newNode;
         tail = newNode;
      }
      else
      {
         newNode.next = head;
         head.prev = newNode;
         head = newNode;
      }
   }

   public static void insertAtEnd(int data)
   {
      Node newNode = new Node(data);
      if(tail == null)
      {
         head = newNode;
         tail=newNode;
      }
      else{
         tail.next = newNode;
         newNode.prev = tail;
         tail = newNode;
      }
   }

   public static void deleteAtFront()
   {
      if(head == null)
         return;
      if(head == tail) //only one node
      {
         head = null;
         tail = null;
      }
      else
      {
         head = head.next;
         head.prev = null;
      }
   }
   public static void deleteAtEnd()
   {
      if(tail==null)
            return;
      if(head == tail) //only one node
      {
          head = null;
          tail = null;
      }
      else
      {
         tail = tail.prev;
         tail.next =null;
      }
   }

   public static void displayBackward()
   {
      Node curr = tail;
      while(curr!=null)
      {
            System.out.print(curr.data + " => ");
            curr = curr.prev;
      }
      System.out.println("null");
   }


   public static void displayForward()
   {
      Node curr = head;
      while(curr!=null)
      {
            System.out.print(curr.data + " => " );
            curr = curr.next;
      }
      System.out.println("null");
   }
}
