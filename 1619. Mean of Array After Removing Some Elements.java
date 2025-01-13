class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int len= arr.length;
        double sum=0;
        int m=len/20;
        for(int i=m; i<len-m;i++){
            sum+=arr[i];
            }
            return sum / (len - 2 * m);
    }
}
