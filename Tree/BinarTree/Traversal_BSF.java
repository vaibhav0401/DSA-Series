package Tree.BinarTree;

import java.util.LinkedList;
import java.util.Queue;

public class Traversal_BSF
{
   public static void LevelOrder(Node root)
   {
      if(root == null)
      {
         return;
      }
      Queue<Node> queue= new LinkedList<>();
      queue.add(root);
      while(!queue.isEmpty())
      {
         Node currentNode = queue.poll();
         System.out.print(currentNode.data + " ");
         if(currentNode.left != null)
            queue.add(currentNode.left);
         if(currentNode.right != null)
            queue.add(currentNode.right);
      }
   }
}
