class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxval=0;
        while(i<j){
            if(height[i]<height[j]){
                maxval=Math.max(maxval,(j-i)*height[i]);
                i++;

            }else if(height[j]<=height[i]){
                maxval=Math.max(maxval,(j-i)*height[j]);
                j--;

            }
        }
        return maxval;
        
    }
}