package Arrays.MaxProfitBuyBuyingAndSellingAStockAtMostTwice;

public class MaxProfitByBuyingAndSellingAtMostTwice {
    

    public static int find(int arr[]){
        int dpl[] = new int [arr.length];
        int mpist = 0; // max profit if sold today
        int leastsf = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i] < leastsf){
                leastsf = arr[i];
            }

            mpist = arr[i] - leastsf;
            if(mpist > dpl[i-1]){
                dpl[i] = mpist;
            }
            else{
                dpl[i] = dpl[i-1];
            }
        }


        int dpr[] = new int [arr.length];
        int mpibt = 0; //max profit if baught today
        int maxat = arr[arr.length-1]; // max after this

        for(int i=arr.length-2; i>=0; i--){
            if(maxat < arr[i]){
                maxat = arr[i];
            }

            mpibt = maxat - arr[i];
            if(mpibt > dpr[i+1]){
                dpr[i] = mpibt;
            }
            else{
                dpr[i] = dpr[i+1];
            }
        }

        int ans = 0;
        for(int i=0; i<arr.length; i++){
            ans = Math.max(dpl[i] + dpr[i], ans);
        }

        return ans;

    }

    public static void main(String[] args){

    }
}
