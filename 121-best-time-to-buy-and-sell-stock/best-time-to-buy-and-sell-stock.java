class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int finprofit=0;
        int minprice=prices[0];
        for(int i=0;i<prices.length;i++){
            minprice=Math.min(prices[i],minprice);
            profit=prices[i]-minprice;
            finprofit=Math.max(finprofit,profit);

        }
        return finprofit;
    }
}