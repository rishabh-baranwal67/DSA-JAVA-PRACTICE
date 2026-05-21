package Tree;
import java.util.*;
public class BinaryTree{
    public BinaryTree(){

    }
    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }
    private Node root;
    public void populate(Scanner scanner){
        System.out.println("Enter the root Node :");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }
    private void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter to the left of the node :" + node.value);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of the left of the :" + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter to the right of the node :" + node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of the right of the :" + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }
    public void display(){
        display(root, "");
    }
    private void display(Node node, String indent){
        if(node == null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }
    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if(node == null) return;
        System.out.println(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(sc);
//        tree.display();
        tree.preOrder();
    }
}
