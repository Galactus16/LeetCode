public class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices.length < 2){
            return 0;
        }else{
            int maxProfit = 0;
            int minStockPrice = prices[0];
        
            for(int i=1; i < prices.length; i++){
                if(maxProfit <= prices[i] - minStockPrice){
                    maxProfit = prices[i] - minStockPrice;
                }
                if(minStockPrice >= prices[i]){
                       minStockPrice = prices[i]; 
                }
            }
            
            return maxProfit;
        }        
        
    }
}