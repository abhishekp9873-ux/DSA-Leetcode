class Solution {
    public int maxSubArray(int[] nums) {
        int n= nums.length;
        int max_s= Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+ nums[i];
            max_s= Math.max(sum, max_s);
            if(sum<0){
                sum=0;
            }   
        }
        return max_s;
    }
}