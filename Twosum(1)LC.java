class Solution {
    public int[] twoSum(int[] nums, int target) {
//         int n = nums.length;
//         int[] ans= new int[2];
//         for(int i=0;i<n;i++){
//             for(int j=i+1; j<n;j++){
//                 if(nums[i]+nums[j]==target){
//                     ans[0]=i;
//                     ans[1]=j;
//                     return ans;
//                 }
//             }
//         }
//         return ans;
//     }
// }


int n=nums.length;
int[] arr= new int[2];

HashMap<Integer, Integer>abhi = new HashMap<>();

for(int i =0; i<n;i++){
    abhi.put(nums[i], i);
}
for(int i= 0; i<n; i++){
    int a= target- nums[i];
if(abhi.containsKey(a) && abhi.get(a) != i){
    arr[0]= i;
    arr[1]= abhi.get(a);
    return arr;
}

}
return arr;
    }
}