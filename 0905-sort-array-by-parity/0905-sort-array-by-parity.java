class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int ans[]=new int[nums.length];
        if(nums.length<=1) return nums;
        int j=0;
        for(int ele:nums){
            if(ele%2==0){
                ans[j]=ele;
                j++;
            }
        }
        for(int ele:nums){
            if(ele%2!=0){
                ans[j]=ele;
                j++;
            }
        }
        return ans;
    }
}