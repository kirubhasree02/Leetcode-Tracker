// Last updated: 22/09/2026, 08:50:03
1class Solution {
2    public int numJewelsInStones(String jewels, String stones) {
3        return stones.replaceAll("[^"+jewels+"]","").length();
4    }
5}