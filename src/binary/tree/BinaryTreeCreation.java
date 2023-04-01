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

    // pre order traversal nlr
    void preOrderTraversal(Node root){
        if(root == null) return;
        System.out.println(root.data); // node
        preOrderTraversal(root.left);  // left
        preOrderTraversal(root.right); // right
    }

    //post order traversal lrn
    void postOrderTraversal(Node root){
        if(root == null) return;
        System.out.println(root.data); // node
        preOrderTraversal(root.right); // right
        preOrderTraversal(root.left);  // left

    }

    //Height of a binary tree
    int heightOfABinaryTree(Node root){
        if(root == null) return 0;
        int lh = heightOfABinaryTree(root.left);
        int rh = heightOfABinaryTree(root.right);
        return Math.max(lh,rh) +1;
    }

    void printNodesAtKDistance(Node root , int k ){
        if(root == null) return;
        if(k == 0 ){
            System.out.println(root.data);
            return;
        }
        printNodesAtKDistance(root.left , k-1);
        printNodesAtKDistance(root.right, k-1);
    }


}
