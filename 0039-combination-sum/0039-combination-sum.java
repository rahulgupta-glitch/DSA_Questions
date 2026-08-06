class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, new ArrayList<>(), 0, target, candidates, result);
        return result;
    }
    
    private void backtrack(int i, List<Integer> currentComb, int total, int target, int[] candidates, List<List<Integer>> result) {
        if (total == target) {
            result.add(new ArrayList<>(currentComb));
            return;
        }
        if (i >= candidates.length || total > target) {
            return;
        }
        currentComb.add(candidates[i]);
        backtrack(i, currentComb, total + candidates[i], target, candidates, result);
        currentComb.remove(currentComb.size() - 1);
        backtrack(i + 1, currentComb, total, target, candidates, result);
    }
}