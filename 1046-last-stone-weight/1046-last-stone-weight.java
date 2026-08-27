class Solution {
    public int lastStoneWeight(int[] stones) {
       PriorityQueue<Integer> pq =new PriorityQueue<>(Collections.reverseOrder());
        for (int i : stones) {
            pq.add(i);
        }
        while (pq.size()> 1) {
            int first = pq.poll();
            int second = pq.poll();
            int diff = Math.abs(first - second);
            if (diff > 0) {
                pq.add(diff);
            }
        }
        return pq.isEmpty() ? 0 : pq.poll();
    }
}