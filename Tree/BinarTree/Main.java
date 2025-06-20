package Tree.BinarTree;

public class Main
{
    public static void main(String[] args) {
        System.out.println("Hello inside main method - Tree");

        BinaryTree binaryTree = new BinaryTree();
        Node root = new Node(1);
        Node left = new Node(2);
        Node right = new Node(3);

        //Setting root of binary tree
        binaryTree.root = root;
        binaryTree.root.left = left;
        binaryTree.root.right = right;

        Node node4 = new Node(4);
        Node node5 = new Node(5);

        binaryTree.root.left.left = node4;
        binaryTree.root.left.right = node5;


        Node node6 = new Node(6);
        binaryTree.root.right.right = node6;

        System.out.println("PreOrder Traversal:");
        Traversal_DFS.preOrder(root);

        System.out.println("\nInOrder Traversal:");
        Traversal_DFS.inOrder(root);

        System.out.println("\nPostOrder Traversal:");
        Traversal_DFS.postOrder(root);


        System.out.println("\nLevel Order Traversal:");
        Traversal_BSF.LevelOrder(root);

    }
}
