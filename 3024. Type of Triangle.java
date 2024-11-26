class Solution {
    public String triangleType(int[] nums) {
        String s="";
        if(nums[0]+nums[1]>nums[2] && nums[0]+nums[2]>nums[1] && nums[1]+nums[2]>nums[0]){
           
        if(nums[0]==nums[1] && nums[0]==nums[2]){
            s="equilateral";
        }
        else if(nums[0]==nums[1] || nums[0]==nums[2] || nums[1]==nums[2])
        {
            s="isosceles";
        }
        else{
            s="scalene";
        }
        }
        else{
            return "none";
        }
        return s;
        }
    }
