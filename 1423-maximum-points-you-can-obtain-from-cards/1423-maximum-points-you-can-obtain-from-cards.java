class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int leftSum = 0;
        int rightSum = 0;
        int maxSum = 0;

        // Take first k cards
        for (int i = 0; i < k; i++) {
            leftSum += cardPoints[i];
        }
        maxSum = leftSum;
        int i = k - 1;
        int j = n - 1;
        while (i >= 0) {
            rightSum += cardPoints[j];
            leftSum -= cardPoints[i];
            i--;
            j--;
            maxSum = Math.max(maxSum, rightSum + leftSum);
        }
        return maxSum;
        
    }
}