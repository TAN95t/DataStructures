package LinkedList.CreateLinkedList;

import LinkedList.BuildLinkedList.Node;

public class solution {

    public static void main(String[] args) {
        Node head = new Node(0);
        for(int i=0; i<10; i++){
            head = LinkedList.BuildLinkedList.Node.addAtFirst(head, i);
        }
        System.out.println(head.data);
        while(head != null){
            System.out.print(head.data+"->");
            head = head.next;
        }
        System.out.print("null");
    }
}
