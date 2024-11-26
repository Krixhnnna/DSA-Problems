class Solution {
    public int findKthPositive(int[] arr, int k) {
        int c=0;
        int l=arr.length;
        int e=1;
        for(int i = 0; i<=l; i++){
            while(i<l && arr[i]!=e){
                c++;
            if(c==k){
               return e;
                }
            e++;
            }
        if(i<l){
                e++;
            }
        }
        return e+(k - c - 1);
    }
}
