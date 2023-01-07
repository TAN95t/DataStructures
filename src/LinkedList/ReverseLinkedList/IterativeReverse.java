package LinkedList.ReverseLinkedList;


public class IterativeReverse {

    
    class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }


    public static Node reverse(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node prev = head;
        Node curr = head.next;

        while(curr != null){
            Node next = curr.next;
            // brak the link
            curr.next = prev;

            // update the nodes
            prev = curr;
            curr = next;

        }

        head.next = null;
        head = prev;

        return head;
    }

    
    public static void main(String[] args) {
        
    }
}
