package Arrays.KthSmallestElement;



import java.util.*;

public class KthSmallestElement {

    public static int findKthSmallestElement(int []arr, int l, int r, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int n = r-l+1;

        for(int i=0; i<n; i++){

            minHeap.add(arr[i]);

        }

        while(k-->1){

            minHeap.poll();

        }

        return minHeap.peek();
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int k = sc.nextInt();
        // int arr[] = new int[n];
        // System.out.println();
        // for(int i=0; i<n; i++){
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println(findKthSmallestElement(arr, 0, n-1, k));
    }
    
}
