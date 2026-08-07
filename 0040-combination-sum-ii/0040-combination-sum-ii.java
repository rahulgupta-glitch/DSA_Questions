class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); 
        
        backtrack(0, new ArrayList<>(), target, candidates, result);
        return result;
    }
    
    private void backtrack(int start, List<Integer> currentComb, int remain, int[] candidates, List<List<Integer>> result) {
        if (remain == 0) {
            result.add(new ArrayList<>(currentComb));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            if (candidates[i] > remain) {
                break;
            }
            currentComb.add(candidates[i]);
            backtrack(i + 1, currentComb, remain - candidates[i], candidates, result);
            currentComb.remove(currentComb.size() - 1);
        }        
    }
}