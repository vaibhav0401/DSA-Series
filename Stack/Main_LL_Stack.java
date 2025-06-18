package Stack;

public class Main_LL_Stack
{
   public static void main(String[] args)
   {
      Stack_LinkedList stackLinkedList = new Stack_LinkedList();
      stackLinkedList.display();
      stackLinkedList.push(10);
      stackLinkedList.push(20);
      stackLinkedList.peek();
      stackLinkedList.display();
      stackLinkedList.push(30);
      stackLinkedList.push(40);
      stackLinkedList.push(50);
      stackLinkedList.display();
      stackLinkedList.pop();
      stackLinkedList.display();
      stackLinkedList.pop();
      stackLinkedList.display();

      stackLinkedList.peek();
   }
}
