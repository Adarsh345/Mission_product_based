package binary.tree;

public class MainClass {
    public static void main(String[] args) {
       BinaryTreeCreation bTree = new BinaryTreeCreation();
      Node root =  bTree.createBinaryTree();
      bTree.inOrderTraversal(root);
    }
}
