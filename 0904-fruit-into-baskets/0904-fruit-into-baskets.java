class Solution {
    public int totalFruit(int[] fruits) {
        int[] freq = new int[fruits.length];
        int left = 0;
        int types = 0;
        int max = 0;
        for (int right = 0; right < fruits.length; right++) {
            if (freq[fruits[right]] == 0) {
                types++;
            }
            freq[fruits[right]]++;
            while (types > 2) {
                freq[fruits[left]]--;

                if (freq[fruits[left]] == 0) {
                    types--;
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}