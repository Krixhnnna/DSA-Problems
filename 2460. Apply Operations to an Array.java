class Solution {
    public int[] applyOperations(int[] nums) {
        int zero=0;
        int n = nums.length;
        for(int i = 0 ; i < n-1; i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
         int c = 0;
        for(int i = 0 ; i < n; i++){
            if(nums[i]!=0){
                nums[c]=nums[i];
                c++;
            } 
        }
        
        for(int i = c ; i <n; i++){
            nums[i]=0;
        }
        
        return nums;
    }
}
