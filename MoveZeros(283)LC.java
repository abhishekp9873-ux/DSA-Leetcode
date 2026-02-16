class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int nonZ=0;
        for(int i =0; i<n;i++){
            if(nums[i] !=0){
                nums[nonZ]=nums[i];
                nonZ++;
            }
        }
        while(nonZ<n){
            nums[nonZ++]=0;
        }

    }
}