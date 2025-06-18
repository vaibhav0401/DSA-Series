package Stack;

public class Stack_LinkedList
{
   Node top = null;

   public Stack_LinkedList()
   {
      this.top=null;
   }

   public void push(int data)
   {
      Node node = new Node(data);
      node.next = top;
      top = node;
   }
   public void pop()
   {
      if(isEmpty())
         return;
      else
      {
         int data =top.data;
         top = top.next;
         System.out.println("Poped element is: " + data);
      }
   }
   public void peek()
   {
      if(isEmpty())
         return;
      else
         System.out.println("Top element is: " + top.data);
   }
   public Boolean isEmpty()
   {
      if(top==null)
      {
         System.out.println("Stack is empty");
         return true;
      }
        else
            System.out.println("Stack is not empty");
        return false;
   }
   public void display()
   {
        if(isEmpty())
             return;
        else
        {
           Node temp = top;
             System.out.print("Stack elements are: ");
             while(temp!=null)
             {
                System.out.print(temp.data + " ");
                temp = temp.next;
             }
             System.out.println();
        }
   }

}
