class Solution {
    public int dominantIndex(int[] nums) {
        int n=nums.length;
        int max=-1;
        int max1=-1;
        int index=-1;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max1=max;
                max=nums[i];
                index=i;
            }else if(nums[i]>max1){
                max1=nums[i];
            }
        }
        if(max1*2<=max){
            return index;
        }
        return -1;
    }
}