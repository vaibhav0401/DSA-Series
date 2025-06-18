package LinkedList.Circular;


public class Main
{
      public static void main(String[] args)
      {
         Operations.addFront(10);
         Operations.displayForward();
         Operations.displayBackward();


         Operations.addFront(5);
         Operations.displayForward();
         Operations.displayBackward();

         Operations.addEnd(15);
         Operations.displayForward();
         Operations.displayBackward();


         Operations.addEnd(20);
         Operations.displayForward();
         Operations.displayBackward();

         Operations.deleteFront();
         Operations.displayForward();
         Operations.displayBackward();

         Operations.deleteEnd();
         Operations.displayForward();
         Operations.displayBackward();



      }
}
