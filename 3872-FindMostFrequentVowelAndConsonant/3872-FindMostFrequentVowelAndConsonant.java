// Last updated: 09/07/2026, 15:05:43
class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        int V = 0, C = 0;
        for (char c : s.toCharArray()) {
            int i = c - 'a';
            freq[i]++;
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                V = Math.max(V, freq[i]);
            else
                C = Math.max(C, freq[i]);
        }
        return V + C;
    }
}
    