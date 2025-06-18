package LinkedList.Singly;

public class Main
{
   public static void main(String[] args)
   {


     Operations.insertAtBeginning(1);
     Operations.printList();
     Operations.insertAtBeginning(4);
      Operations.insertAtBeginning(1);

      Operations.insertAtEnd(5);
      Operations.insertAtEnd(8);

      Operations.printList();
      Operations.insertAtPosition(9,2);
      Operations.printList();

      Operations.insertAtPosition(10,4);
      Operations.printList();

      Operations.insertAtPosition(11,4);
      Operations.printList();

      Operations.deleteAtBeginning();
      Operations.printList();

      Operations.deleteAtEnd();
      Operations.printList();

      Operations.deleteAtPosition(4);
      Operations.printList();

      Operations.deleteSpecificElement(11);
      Operations.printList();

      Operations.search(10);
      Operations.search(100);
      Operations.insertAtBeginning(4);
      Operations.insertAtBeginning(1);
      Operations.insertAtBeginning(4);
      Operations.insertAtBeginning(1);
      Operations.printList();


      Operations.removeNthFromEnd(3);
      Operations.printList();


   }
}
