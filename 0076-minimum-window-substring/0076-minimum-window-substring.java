class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int left = 0;
        int count = 0;
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);

                if (map.get(c) >= 0) {
                    count++;
                }
            }
            while (count == t.length()) {
                if (right - left + 1 < min) {
                    min = right - left + 1;
                    ans = left;
                }
                char x = s.charAt(left);
                if (map.containsKey(x)) {
                    map.put(x, map.get(x) + 1);
                    if (map.get(x) > 0) {
                        count--;
                    }
                }
                left++;
            }
        }
        if (min == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(ans, ans + min);
    }
}