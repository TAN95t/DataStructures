package LinkedList.DetectLoop;

import LinkedList.BuildLinkedList.Node;

public class DetectLoop {
    
    public static boolean detect(Node head){
        
        if(head == null || head.next == null){
            return false;
        }

        Node turt = head;
        Node hare = head;

        while(hare.next != null && hare.next.next != null){
            turt = turt.next;
            hare = hare.next.next;

            if(hare == turt){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        
    }
}
