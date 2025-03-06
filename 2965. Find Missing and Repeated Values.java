class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int len = grid.length;
        int arr[] = new int[2];
        for(int i = 1; i <= len*len; i++){
            int c=0;
            for(int a = 0; a < len ; a++){
                for(int b= 0 ; b < len; b++){
                    if(i == grid[a][b]){
                        c++;
                    }
                }
            }
            if(c==2){
                arr[0]=i;
            }
            if(c==0){
                arr[1]=i;
            }
        }
        return arr;
    }
}
