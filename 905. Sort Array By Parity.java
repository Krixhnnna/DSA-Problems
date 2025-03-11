class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] r = new int[nums.length];
        int in =0;
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i]%2==0){
                r[in]=nums[i];
                in++;
            }
        }
         for(int i = 0; i < nums.length; i++){
            if(nums[i]%2!=0){
                r[in] =nums[i];
                in++;
            }
        }
        return r;
    }
}
