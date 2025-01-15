class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       int n = candies.length;
       ArrayList<Boolean> r = new ArrayList<Boolean>();
       for(int i=0; i<n; i++){
        int c=0;
        for(int j = 0; j < n; j++){
        if(candies[i]+extraCandies>= candies[j]){
            c++;
        }}
        if(c==n){
            r.add(true);
        }
        else{
            r.add(false);
        }
       }
       return r;
    }
}
