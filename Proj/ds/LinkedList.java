package Proj.ds;

public class LinkedList {
    public class  Node {
    Node head;

    int data;
    Node next;
     Node(int d){
        data=d;
        next=null;
    }
        
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println(list);
    }
}
