//INSERTNG A NODE AT VERY FIRST POSITION
//
// class Node {
//     int data;
//     Node next;
//
//     Node(int x) {
//         data = x;
//         next = null;
//     }
// }

//     public class LL_operations {
//         public static Node insertAtFront(Node head, int new_data) {
//             Node new_node = new Node(new_data);
//             new_node.next = head;
//             return new_node;
//         }
//
//         public static void printList(Node head) {
//             Node curr = head;
//             while (curr != null) {
//                 System.out.print(" " + curr.data);
//
//                 curr = curr.next;
//             }
//             System.out.println();
//         }
//
//         public static void CollectionsClass(String[] args) {
//             Node head = new Node(2);
//             head.next = new Node(3);
//             head.next.next = new Node(4);
//             head.next.next.next = new Node(5);
//
//             System.out.println("Original LL:");
//             printList(head);
//
//             System.out.println("LL after adding a new node:");
//             int data = 1;
//             head = insertAtFront(head, data);
//             printList(head);
//         }
//     }
//
//class Node {
//    int data;
//    Node next;
//    Node(int x){
//        data = x;
//        next = null;
//    }
//}
//
//public class LL_operations {
//    static Node deleteNode(Node head,int pos){
//        Node temp = head;
//        Node prev = null;
//        if(temp == null){
//            return  null;
//        }
//        if(pos == 1){
//            head = temp.next;
//            return head;
//        }
//        for(int i =1; i< pos && temp != null; i++){
//            prev = temp;
//            temp = temp.next;
//        }
//        if(temp != null){
//            prev.next = temp.next;
//        }
//        return head;
//    }
//    public static void printList(Node head){
//        while(head != null){
//            System.out.print(head.data + "->");
//            head = head.next;
//        }
//        System.out.println("null");
//    }
//
//    public static void CollectionsClass(String[] args) {
//        Node head = new Node(1);
//        head.next = new Node(2);
//        head.next.next = new Node(3);
//        head.next.next.next = new Node(4);
//        System.out.println("LL before deletion:");
//        printList(head);
//        head = deleteNode(head, 2);
//        System.out.println("LL after deletion:");
//        printList(head);
//    }
//
//}

//CODE OF DELETION OF A NODE AT BEGINING OF LL
//
//
//Node temp = head;
//head = head.next;
//temp = null;
//        return head;




//CODE OF DELETING A NODE AT END
//
//        if(head == null){
//        return head;
//        }
//                if(head.next == null){
//Node temp = head;
//head = head.next;
//temp = null;
//        return head;
//        }
//Node secondLast = head;
//        while(secondLast.next.next != null){
//secondLast = secondLast.next;
//        }
//secondLast.next =null;
//        return head;

import javax.swing.*;
//
//class Node{
//    int data;
//    Node next;
//    Node(int x) {
//        data = x;
//        next = null;
//    }
//}
//public class LL_operations{
//    static Node insertAtB(Node last,int data){
//        Node newNode = new Node(1);
//        if(last == null){
//            newNode.next = newNode;
//            return newNode;
//        }
//
//        Node temp = last.next;
//        newNode.next = temp;
//        last.next = newNode;
//        return last;
//    }
//    public static void printList(Node last) {
//      if(last == null ) return ;
//      Node head = last.next;
//      while(true){
//          System.out.print(head.data + " ");
//          head = head.next;
//          if(head == last.next) break;
//      }
//        System.out.println(" ");
//    }
//    public static void CollectionsClass(String[] args) {
//        Node first = new Node(2);
//        first.next = new Node(3);
//        first.next.next = new Node(4);
//        Node last = first.next.next;
//        last.next = first;
//
//        System.out.println("before insertion :");
//        printList(last);
//
//        last = insertAtB(last, 1);
//        System.out.println("after insertion :");
//        printList(last);
//
//    }
//}

