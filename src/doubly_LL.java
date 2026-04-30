//
//class Node {
//    int data;
//    Node next;
//    Node prev;
//    Node(int x){
//        data = x;
//        next = null;
//        prev = null;
//    }
//};
//public class doubly_LL {
//    static Node deleteNode(Node head){
////        Node curr = head;
//        if(head == null){
//            return null;
//        }
//        if(head.next == null){
//            head = null;
//            return head;
//        }
//        Node temp = head;
//        Node prev = null;
//
//        while(temp.next.next != null){
//            temp = temp.next;
//            prev = temp;
//        }
//        if(temp != null){
//            temp.next = null;
//        }
//        return head;
//    }
//    public static void printList(Node head) {
//        Node curr = head;
//        while (curr != null) {
//            System.out.print(" " + curr.data);
//
//            curr = curr.next;
//        }
//        System.out.println();
//    }
//
//    public static void CollectionsClass(String[] args) {
//
//        Node head = new Node(11);
//        Node second = new Node(22);
//        Node third = new Node(33);
//
//        head.next = second;
//        second.prev = head;
//        second.next = third;
//        third.prev = second;
//        printList(head);
//        deleteNode(head);
////        head = iaf(head,1);
//        printList(head);
//    }
//}
//



// INSERTINT A NODE AT BEGINING
//
//public static Node iaf(Node head, int data){
//    Node new_node = new Node(data);
//    new_node.next = head;
//
//    if(head != null){
//        head.prev = new_node;
//    }
//    return new_node;
//}
//public static void printList(Node head){
//    Node curr = head;
//    while (curr != null) {
//        System.out.print(" " + curr.data);
//
//        curr = curr.next;
//    }
//    System.out.println();



//
//    public static void backwardTraversal(Node head){
//        Node curr = head;
//        while(curr != null){
//            System.out.print(curr.data + "->");
//            curr = curr.next;
//        }
//        System.out.println("null");
////        while(curr != null){
////            System.out.print(curr.data + "<->");
////            curr = curr.prev;
////        }
////        System.out.println("null");
//    }
//
//    public static int findSize(Node curr){
//        int count = 0;
//        while( curr != null){
//            count++;
//            curr = curr.next;
//        }
//        return count;
//    }
//    public static void CollectionsClass(String[] args) {
//        Node head = new Node(1);
//        head.next = new Node(2);
//        head.next.next = new Node(3);
//
////        Node head = new Node(11);
////        Node second = new Node(22);
////        Node third = new Node(33);
////
////        head.next = second;
////        second.prev = head;
////        second.next = third;
////        third.prev = second;
//
//        System.out.println("backward traversal");
////        backwardTraversal(head);
//        System.out.println(findSize(head));
//    }
//}
