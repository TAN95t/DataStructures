package Arrays.BestTimeToBuyAndSellStock;

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int [] prices){
        int lsf = Integer.MAX_VALUE;
        int pist = 0; // profit if sold today
        int op =0; // overall profit

        for(int i=0; i<prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(pist > op){
                op = pist;
            }
        }

        return op;
    }

    public static void main(String[] args) {
        
    }
}
