class Solution {
    public int countPairs(int[] nums, int k) {
        int c = 0;
        int n= nums.length;
        for(int i = 0 ; i < n; i++){
            for(int j= 0 ; j < n; j++){
                if(i < j && nums[i] == nums[j] && (i*j)%k==0){
                    c++;
                }
            }
        }
        return c;
    }
}
