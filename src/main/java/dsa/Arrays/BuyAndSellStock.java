package dsa.Arrays;

public class BuyAndSellStock {
        public static void main(String[] args) {
            
        }
        public int maxProfit(int prices[]) {
        // code here
        int profit =0;
        int buy=0;
        for(int i=0;i<prices.length;i++)
        {
            if(buy==0)
            {
                buy = prices[i];
            }
            if(prices[i]>prices[i+1])
            {
                int cProfit = buy - prices[i];
                profit = profit +cProfit;
                buy = 0;
            }
            if(i==prices.length-1)
            {
                 int cProfit = buy - prices[i];
                profit = profit +cProfit;
                buy = 0;
            }

        }
        return profit;
    }
}
