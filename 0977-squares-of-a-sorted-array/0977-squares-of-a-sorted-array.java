class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int result[]=new int[n];
        for(int i=0;i<nums.length;i++){
            result[i]=nums[i]*nums[i];
        }
        for (int i = 0; i <n-1; i++) {
            for (int j = 0; j <n-i-1; j++) {
                if (result[j]>result[j+1]){
                    int temp=result[j];
                    result[j]=result[j+1];
                    result[j+1]=temp;
                }
            }
        }
        //Arrays.sort(nums);
        return result;
    }
}