package LinkedList.Doubly;

import LinkedList.Doubly.Operations;
public class Main
{
    public static void main(String[] args) {

        // Insert elements
       Operations.insertAtEnd(10);
       Operations.insertAtEnd(20);
       Operations.insertAtEnd(30);

       Operations.displayForward();
       Operations.displayBackward();


       Operations.addFront(5);

       Operations.displayForward();
       Operations.displayBackward();


       Operations.deleteAtFront();

       Operations.displayForward();
       Operations.displayBackward();


       Operations.deleteAtEnd();

       Operations.displayForward();
       Operations.displayBackward();

    }
}
