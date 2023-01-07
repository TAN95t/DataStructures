package Arrays.NextPermutation;

public class NextPermutation {

    public static void nextPermutation(int A[]){
        if(A.length <= 1 || A == null){
            return;
        }

        int i = A.length -2;
        while(i>=0 && A[i] >= A[i+1]) i--;
        if(i >= 0){
            int j = A.length -1;
            while(A[j] <= A[i]) j--;
            swap(A,i,j);
        }
        reverse(A, i+1, A.length-1);
    }

    public static void swap (int [] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void reverse(int A[], int i, int j){
        while(i < j){
            swap(A, i, j);
            i++;
            j--;
        }
    }
    
    public static void main(String[] args) {
        
    }

}
