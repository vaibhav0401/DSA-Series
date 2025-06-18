package LinkedList.Singly;

public  class Operations
{
   static Node head = null;

   // Insert At the Beginning
   public static void insertAtBeginning(int data)
   {
      Node newNode = new Node(data);
     if(head==null)
     {
        head = newNode;
        return;
     }
      newNode.next = head;
      head= newNode;
   }

   // Insert At the End

   public static void insertAtEnd(int data)
   {
      if(head== null)
      {
         head = new Node(data);
         return;
      }
      Node temp = head;
      while(temp.next != null)
      {
         temp = temp.next;
      }
      temp.next  = new Node(data);
   }

   // Insert At a Specific Position

   public static void insertAtPosition(int data, int position)
   {
      if(position < 0)
         throw new IllegalArgumentException("Position must be non-negative.");
      if(position == 0)
      {
         insertAtBeginning(data);
         return;
      }
      Node temp=  head;
      int index=0;
      while(temp.next!=null && index<position-1)
      {
         temp = temp.next;
         index++;
      }

      if(temp==null)
         throw new IllegalArgumentException("Position out of bounds.");

        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
   }


   public static void deleteAtBeginning()
   {
      if(head == null)
         throw new IllegalArgumentException("List is empty.");
      head=head.next;
   }


   public static void deleteAtEnd()
   {
      if(head == null)
         throw new IllegalArgumentException("List is empty.");
      if(head.next == null)
         head = null;
      Node temp = head;
      while(temp.next.next != null)
      {
         temp=temp.next;
      }
      temp.next=null;
   }


   public static void deleteAtPosition(int position)
   {
      if(head== null)
            throw new IllegalArgumentException("List is empty.");
      if(position<0)
            throw new IllegalArgumentException("Position must be non-negative.");
      if(position==0)
         deleteAtBeginning();
      Node temp = head;
      int index =0;
      while(temp.next!=null && index<position)
      {
         temp = temp.next;
         index++;

      }
      if(temp==null || temp.next==null)
         throw new IllegalArgumentException("Position out of bounds.");

      temp.next = temp.next.next;
   }

   public static void deleteSpecificElement(int ele)
   {
      if(head==null)
          throw new IllegalArgumentException("List is empty.");

       if(head.data == ele)
       {
          head = head.next;
          return;
       }
        Node temp = head;
      while(temp!=null && temp.next.data!=ele)
         temp =temp.next;

      if(temp==null || temp.next==null)
            throw new IllegalArgumentException("Element not found in the list.");
      temp.next=temp.next.next;
   }

   public static void search(int ele)
   {
      if(head== null)
            throw new IllegalArgumentException("List is empty.");
      Node temp = head;
      int index =-1;
       for(int i=0;temp!=null;i++)
       {
          if(temp.data == ele)
             index= i+1;
          temp=temp.next;
       }

      if(index==-1)
         System.out.println("Element not found in the list.");
      else
         System.out.println("Element found at position: " + index);
   }


   public static void  removeNthFromEnd( int n) {
      Node slow= head;
      Node fast=head;
      int i=0;
      if(n==1)
      {
         head=head.next;
         return ;
      }

      while(fast.next!=null)
      {
         if(i<n)
         {
            fast=fast.next;
         }
         else{
            slow= slow.next;
            fast= fast.next;
         }
         i++;
      }
      slow.next=slow.next.next;
      return;
   }



   public static void printList()
   {
      Node temp = head;
      while (temp != null)
      {
         System.out.print(temp.data + "=> ");
         temp = temp.next;
      }
        System.out.println("null");
   }

}
