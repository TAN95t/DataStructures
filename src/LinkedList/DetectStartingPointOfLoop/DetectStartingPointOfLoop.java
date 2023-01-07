package LinkedList.DetectStartingPointOfLoop;

public class DetectStartingPointOfLoop {
    

    class Node {
        int data;
        Node next;
        Node (int data){
            this.data = data;
            this.next = null;
        }
    }

    public static int detectStartingPoint(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                break;
            }
        }

        if(fast == null || fast.next == null){
            return -1;
        }

        Node temp = head;
        while(temp != slow){
            temp = temp.next;
            slow = slow.next;
        }

        return temp.data;
    }

    public static void main(String[] args) {
        
    }
}
