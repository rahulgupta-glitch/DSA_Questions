class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, nums, 0);
        return result;
    }
    
    private void backtrack(List<List<Integer>> result, int[] nums, int index) {
        if (index == nums.length) {
            List<Integer> currentPerm = new ArrayList<>();
            for (int num : nums) {
                currentPerm.add(num);
            }
            result.add(currentPerm);
            return;
        }
        
        Set<Integer> seen = new HashSet<>();
        
        for (int i = index; i < nums.length; i++) {
            if (seen.add(nums[i])) {
                swap(nums, index, i);
                backtrack(result, nums, index + 1);
                swap(nums, index, i);
            }
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}