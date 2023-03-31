package binary.tree;

import java.util.Scanner;

public class BinaryTreeCreation {
    Scanner scn;
    Node root;
    public BinaryTreeCreation(){
        scn = new Scanner(System.in);
    }
    //create a binary tree and return the root node
    Node createBinaryTree(){
       System.out.println("Enter node data");
       int data = scn.nextInt();

       // check that input is -1 that means
        // user dosen't want to create binary tree
        if(data == -1) return null;

        Node node = new Node(data);

        System.out.println("Enter "+data+" +'s left data ");
        node.left = createBinaryTree();

        System.out.println("Enter "+data+" +'s right data ");
        node.right = createBinaryTree();

        return node;
    }


    // Inorder traversal
    void inOrderTraversal(Node root){
        if(root == null) return;
        inOrderTraversal(root.left);
        System.out.println(root.data);
        inOrderTraversal(root.right);
    }


}
