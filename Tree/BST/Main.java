package Tree.BST;

import Tree.BinarTree.Traversal_BSF;

public class Main
{
   public static void main(String[] args)
   {
      BinarySearchTree bst = new BinarySearchTree();
      bst.root= new Node(55); // Setting the root of the BST
      bst.insertData(50);
      bst.insertData(30);
      bst.insertData(20);
      bst.insertData(40);
      bst.insertData(70);
      bst.insertData(60);
      bst.insertData(80);
      bst.insertData(10);

      System.out.println("InOrder Traversal of the BST:");
      bst.inOrderTraversal(bst.root);

        System.out.println("\nPreOrder Traversal of the BST:");
        bst.preOrderTraversal(bst.root);

        System.out.println("\nPostOrder Traversal of the BST:");
        bst.postOrderTraversal(bst.root);

      bst.deleteData(55);

      System.out.println("InOrder Traversal of the BST:");
      bst.inOrderTraversal(bst.root);


      System.out.println("\nSearching for 30 in the BST: " + bst.search(30));

      System.out.println("Level Order Traversal of the BST:");
      bst.levelOrderTraversal(bst.root);
   }
}
