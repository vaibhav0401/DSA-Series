package Tree.BST;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree
{
   Node root;

   public BinarySearchTree()
   {
      this.root = null;
   }


   //Insert
   private Node insert(Node root,int data)
   {
      if (root == null)
         return new Node(data);
      if (data < root.data)
      {
         //moving to left
         root.left = insert(root.left,data);
      }
      else if(data>root.data)
      {
         //moving to right
         root.right= insert(root.right,data);
      }
      return root;

   }

   public void insertData(int data)
   {
      insert(root, data);
   }


   //Delete

   private Node delete(Node root, int data)
   {
      if(root==null)
         return root;
      if(data < root.data)
      {
         //Moving ot left
         root.left = delete(root.left, data);
      }
      else if(data > root.data)
      {
         //Moving to right
         root.right = delete(root.right, data);
      }
      else
      {
         //Value == data
         //Case 1  :  with no child
         if(root.left == null && root.right == null)
            return null;
         //Case 2 : left ==null && right !=null
         else if(root.left==null)
            return root.right;
         //Case 3 : left !=null && right ==null
         else if(root.right==null)
                return root.left;
         else
         {
            Node successor = findSuccessor(root.right);
            root.data =successor.data;
            delete(root.right, successor.data);
         }
      }
      return root;
   }

   public Node findSuccessor(Node node)
   {
      while(node.left != null)
      {
         node = node.left;
      }
      return node;
   }
   public void deleteData(int data)
   {
      root = delete(root, data);
   }


   //Search
   public boolean search(int data)
   {
      return search(root, data);
   }

   private boolean search(Node root,int data)
   {
      if(root == null)
         return false;
      if(root.data==data)
         return true;
      return data<root.data? search(root.left, data):search(root.right, data);
   }

   public static void inOrderTraversal(Node node)
   {
      if(node==null)
         return;
      System.out.print(node.data + " ");
      inOrderTraversal(node.left);
      inOrderTraversal(node.right);
   }

   public static void preOrderTraversal(Node root)
   {
      if (root == null)
         return;
      preOrderTraversal(root.left);
      System.out.print(root.data + " ");
      preOrderTraversal(root.right);
   }

   public static void postOrderTraversal(Node root)
   {
      if (root == null)
         return;
      postOrderTraversal(root.left);
      postOrderTraversal(root.right);
      System.out.print(root.data + " ");
   }

   public static void levelOrderTraversal(Node root)
   {
      if(root==null)
         return;
      Queue<Node> queue = new LinkedList<>();
      queue.add(root);
      while(!queue.isEmpty())
      {
         Node currentNode = queue.poll();
         System.out.print(currentNode.data + " ");
         if(currentNode.left!=null)
            queue.add(currentNode.left);
         if(currentNode.right!=null)
            queue.add(currentNode.right);
      }
   }
}



