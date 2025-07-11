package Tree.BinarTree;

public class Traversal_DFS
{
   //Traversal
   //DFS
   //PreOrder - Root -> Left -> Right
   public static void preOrder(Node node)
   {
      if (node == null) {
         return;
      }
      System.out.print(node.data + " ");

      preOrder(node.left);
      preOrder(node.right);

   }

   //InOrder - Left -> Root -> Right
   public static void inOrder(Node node)
   {
      if(node == null) {
         return;
      }
      inOrder(node.left);
      System.out.print(node.data + " ");
      inOrder(node.right);
   }

   //PostOrder - Left -> Right -> Root
   public static void postOrder(Node node)
   {
      if(node == null) {
         return;
      }
      postOrder(node.left);
      postOrder(node.right);
      System.out.print(node.data + " ");
   }
}
