package Arrays.CyclicallyRotateArrayByOne;

public class CyclicallyRotateArraybyOne {
    

    public static void rotate(int arr[], int n){
        int last = arr[n-1];
        for(int i=n-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;
    }

    public static void main(String[] args) {
        
    }
}
