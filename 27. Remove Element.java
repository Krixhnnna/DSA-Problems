class Solution {
    public int removeElement(int[] nums, int val) {
        int c=0;
        int l = nums.length;
        int n[] = new int[l];
        for(int i = 0; i<l;i++){
            n[i]=nums[i];
        }
            for(int i = 0; i < l; i++){
            if(nums[i]==val){
                ; // eat 5 Star do nothing
            }
            else{
                nums[c]=n[i];
                c+=1;
            }
        }
        return c;
        }
}
