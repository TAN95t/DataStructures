package LinkedList.ReverseLinkedList;

public class RecursiveReverse {
    
    class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node reverse(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    
    public static void main(String[] args) {
        
    }
}
