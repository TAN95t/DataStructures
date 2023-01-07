package LinkedList.DeleteLoopFromLinkedList;



public class DeleteLoop {
    
    class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void removeLoop(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast){
                break;
            }

            if(fast == null || fast.next == null){
                return;
            }

            Node temp = head;
            while(slow != temp){
                slow = slow.next;
                temp = temp.next;
            }

            while(fast.next != temp){
                fast = fast.next;
            }

            fast.next = null;
        }
    }

    public static void main(String[] args) {
        
    }
}
