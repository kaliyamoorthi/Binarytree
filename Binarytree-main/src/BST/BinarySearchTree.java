package BST;

public class BinarySearchTree {
    Node root;
    BinarySearchTree(){
        root = null;
    }

    public static class Node{
        int data;
        Node leftChild, rightChild;
        Node(int data){
            this.data =data;
            this.leftChild = null;
            this.rightChild = null;
        }
    }
    public Node insert(int data, Node root){

        if(root==null){
            Node temp = new Node(data);
            root = temp;
            System.out.println("Value inserted is: "+data);
            return root;
        }
        if(data < root.data){
            if(root.leftChild == null){
                Node temp = new Node(data);
                root.leftChild = temp;
                System.out.println("Value inserted is: "+data);
                return root;
            }
            insert(data,root.leftChild);
        }
        if(data> root.data){
            if(root.rightChild == null){
                Node temp = new Node(data);
                root.rightChild = temp;
                System.out.println("Value inserted is: "+data);
                return root;
            }
            insert(data,root.rightChild);
        }
        return root;
    }
    public  void printInorder(Node root){
        if(root.leftChild==null && root.rightChild == null){
            System.out.print(root.data + " ");
            return;
        }
        if(root.leftChild!=null){
            printInorder(root.leftChild);
        }
        System.out.print(root.data + " ");
        if(root.rightChild!=null){
            printInorder(root.rightChild);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int [] arr = new int[]{6,4,2,5,7,8};
        for (int i =0; i< arr.length;i++) {
          bst.root = bst.insert(arr[i], bst.root);
        }
        bst.printInorder(bst.root);

        /*Node root = new Node(5);
        Node lc = new Node(2);
        Node rc = new Node(6);
        root.leftChild = lc;
        root.rightChild =rc;
        System.out.println("root is:" + root.data);
        System.out.println("root's left child is:" + root.leftChild.data);
        System.out.println("root's RIGHT CHILD  is:" + root.rightChild.data);
        */
    }
}
