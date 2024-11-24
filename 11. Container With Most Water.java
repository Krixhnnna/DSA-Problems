class Solution {
    public int maxArea(int[] height) {
    int len=height.length;
    int c=0;
    int l=0;
    int r=len-1;
    int area=0;
    int result=0;
    while (l<r){
        int m =Math.min(height[l], height[r]);
        area = (r-l) * m;
        result= Math.max(result,area);
        if(height[l]<height[r]){
            l+=1;
        }
        else{
            r-=1;
        }
    }
    return result;
    }
}