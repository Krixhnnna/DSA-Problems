class Solution {
    public int maxProfit(int[] prices) {
        int low = Integer.MAX_VALUE; 
        int high = 0;
        for(int i : prices){
            if(i < low ){
                low = i; 
            }else{
                int profit = i - low;
            high = Math.max(high,profit);
        } 
    } 
    return high;
    }
}
