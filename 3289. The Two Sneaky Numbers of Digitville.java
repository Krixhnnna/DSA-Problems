class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length;
        int in=0;
        int k =0;
        int[] arr = new int[n];
        List <Integer> list = new ArrayList<>();
        List <Integer> res = new ArrayList<>();
        for(int i = 0 ; i < n; i++){
            if(!res.contains(nums[i])){
                res.add(nums[i]);
                in++;
            }
            else{
                arr[k]= nums[i];
                k++;
            }
           
        }
        return  Arrays.copyOfRange(arr,0,k);
    }
}
