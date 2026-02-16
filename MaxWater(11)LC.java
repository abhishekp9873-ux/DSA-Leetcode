class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int Ht;
        int Base;
        int maxArea=0;
        int i=0, j=n-1;
        while(i<j){
                Base=j-i;
                Ht= Math.min(height[i], height[j]);
                int area= Base * Ht ; 
                maxArea= Math.max(maxArea, area);

                if(height[i] < height[j]){
                    i++;
                }else{
                    j--;
                }
                
            }
        
        return maxArea;
        
    }
}