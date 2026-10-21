class Solution {
    public int arrayNesting(int[] nums) {
        int n = nums.length;
        boolean[] visited = new boolean[n];
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            int index = i;

            while (!visited[index]) {
                visited[index] = true;
                index = nums[index];
                count++;
            }

            maxLength = Math.max(maxLength, count);
        }

        return maxLength;
    }
}