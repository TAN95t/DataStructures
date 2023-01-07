package OA;

public class stringWeight {
    
    public static void main(String[] args) {
        long arr[] = new long[26];
        arr[0] = 1;
        for(int i=1; i<arr.length; i++){
            arr[i] = ((i+1)*arr[i-1])+arr[i-1];
        }
        
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
