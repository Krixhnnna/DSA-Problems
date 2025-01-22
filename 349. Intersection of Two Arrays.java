class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> r = new ArrayList<>();
        for(int i = 0 ; i < nums1.length; i++){
            int c=0;
            for(int j = 0; j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    c++;
                }
            }
            if(c>0){
                    r.add(nums1[i]);
                }
        }
        r = r.stream().distinct().toList();
        int[] arr = new int[r.size()];
        for(int i = 0; i<r.size();i++){
            arr[i]=r.get(i);
        }
        return arr;
    }
}
