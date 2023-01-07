package Arrays.FindFactorialOfLargeNumber;



public class FindFactorinlOfLargeNumber {
    
    public static class Node{
        int data;
        Node prev = null;
        Node (int data){
            this.data = data;
            this.prev = null;
        }
    }    

    public static void findFact(int n){
        Node tail = new Node(1);
        for(int i=2; i<=n; i++){
            multiply(tail, i);
        }
        print(tail);
    }

    public static void multiply(Node tail, int n){
        Node temp = tail, prevNode = tail;
        int carry =0;
        while(tail != null){
            int data = temp.data * n + carry;
            temp.data = data % 10;
            carry = data / 10;
            prevNode = temp;
            temp = temp.prev;
        }

        while(carry != 0){
            prevNode.prev = new Node((int)carry % 10);
            carry /= 10;
            prevNode = prevNode.prev;
        }
    }

    public static void print(Node tail){
        if(tail == null){
            return;
        }
        print(tail.prev);
        System.out.println(tail.data);
    }

    public static void main(String[] args) {
        
    }
}
