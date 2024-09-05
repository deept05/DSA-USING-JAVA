import java.util.*;

public class height {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    // creating binary tree and finding root node
    public static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static int heightTree(Node root){
        if(root == null){
            return 0;
        }

        int leftHeight = heightTree(root.left);
        int rightHeight = heightTree(root.right);

        int maxHeight = Math.max(leftHeight, rightHeight) + 1;
        return maxHeight;
    }



    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();

        Node root = tree.buildTree(nodes);

        // System.out.println(root.data);

        System.out.println(heightTree(root));

        
    }
    
}
