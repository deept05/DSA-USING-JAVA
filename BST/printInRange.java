public class printInRange {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void printrange(Node root, int x, int y){
        if(root.data == null){
            return;
        }
        if(root.data >= x && root.data <= y){
            printrange(root.left, x, y);
            System.out.println(root.data + " ");
            printrange(root.right, x, y);
        }
        else if(root.data >= y){
            printrange(root.left, x, y);
        }
        else{
            printrange(root.right, x, y);
        }
    }

    
    

    public static void main(String args[]) {
        int[] values = {5, 1, 3, 4, 2, 7};
        Node root = null;

        printrange(root, 6, 10);

        
        
    }
}
