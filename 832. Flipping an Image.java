class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[][] inverse = new int[n][n];
        for(int i = 0; i < n; i++){
            int k=0;
            for(int j = n-1; j>=0; j--){
                inverse[i][k] = image[i][j];
                k++;
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j<n; j++){
                if(inverse[i][j]==1){
                    inverse[i][j]=0;
                }
                else{
                    inverse[i][j]=1;
                }
            }
        }
        return inverse;
    }
}
