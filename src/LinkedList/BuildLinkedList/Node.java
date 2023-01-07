package LinkedList.BuildLinkedList;

public class Node {
    public int data;
    public Node next;
    public Node ptr;
    public Node(int data){
        this.data = data;
        this.next = null;
        this.ptr = null;
    }

    public static Node addAtFirst(Node head,int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

        return head;
    }
}
