public class delete {
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

    public static Node delete(Node root, int val){
        if(root.data > val){
            return delete(root.left, val);
        }
        else if(root.data < val){
            return delete(root.right, val);
        }
        else{
            // case 1 :
            if(root.left == null && root.right == null){
                return null;
            }
            
            // case 2:
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

        }


    }

    

    public static void main(String args[]) {
        int[] values = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        if(search(root, 6)){
            System.out.println("found");
        }
        else
        System.out.println("Not found");{

        }

        // inorder(root);  // Call inorder to print the tree
    }
}
