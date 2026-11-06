class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;
        for (int j = 0; j < n; j += 2) {
            for (int i = 0; i < n - 2; i += 2) {
                if (nums[i] > nums[i + 2]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 2];
                    nums[i + 2] = temp;
                }
            }
        }
        for (int j = 1; j < n; j += 2) {
            for (int i = 1; i < n - 2; i += 2) {
                if (nums[i] < nums[i + 2]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 2];
                    nums[i + 2] = temp;
                }
            }
        }
        return nums;
        
    }
}