class Solution {
    public int arrayPairSum(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]) max=nums[i];
            if(min>nums[i]) min=nums[i];
        }
        int[]count=new int[max-min+1];
        for(int i=0;i<nums.length;i++){
            count[nums[i]-min]++;
        }
        int index=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                nums[index]=i+min;
                index++;
                count[i]--;
            }
        }
        int sum=0;
        for(int i=0;i<nums.length;i+=2){
            sum+=nums[i];
        }
        return sum;
    }
}
        // Arrays.sort(nums);
        // int sum = 0;
        // for (int i = 0; i < nums.length; i += 2) {
        //     sum += nums[i];
        // }
        // return sum;