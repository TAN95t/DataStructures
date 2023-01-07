package DynamicProgramming.PermutationCoefficientProblem;

public class PermutationCoefficientProblem {

    public static int solve(int n, int k){
        int p = 1;
        for(int i=0; i<k; i++){
            p*=(n-i);
        }

        return p;
    }

    public static void main(String[] args){

    }
}
