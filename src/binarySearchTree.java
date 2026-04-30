//
//    public class binarySearchTree {
//        public static void printInorder(Node node){
//            if(node == null) return;
//            printInorder(node.left);
//
//            System.out.print(node.key + " ");
//
//            printInorder(node.right);
//
//        }
//        public static void CollectionsClass(String[] args) {
//            Node root = new Node(1);
//            root.left = new Node(2);
//            root.right = new Node(3);
//            root.left.left = new Node(4);
//            root.left.right = new Node(5);
//            root.right.right = new Node(6);
//            printInorder(root);
//        }
//    }
    class Node {
        int key;
        Node left ;
        Node right;
        Node(int x){
            key = x;
            left = null;
            right = null;
        }
    }

    //INSERTION IN BINARY SEARCH TREE
    public class binarySearchTree {
    static Node insert(Node root,int key){
        if(root == null){
            return new Node(key);
        }
        if(root.key == key){
            return root;
        }
        if(key < root.key){
            root.left = insert(root.left,key);
        }
        else {
            root.right = insert(root.right,key);
        }
        return root;
    }
        public static void printInorder(Node node){
            if(node != null) {
                printInorder(node.left);
                System.out.print(node.key + " ");
                printInorder(node.right);
            }
        }

        public static void main(String[] args) {
            Node root = null;
            root = insert(root,50);
            root = insert(root,20);
            root = insert(root,30);
            root = insert(root,70);
            root = insert(root,60);
            root = insert(root,80);
            root = insert(root,25);

            printInorder(root);
        }
    }