class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length<=2) return -1;
        Arrays.sort(nums);
        return nums[1];
        // int max=0;
        // int min=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]>)
        // }
    }
}