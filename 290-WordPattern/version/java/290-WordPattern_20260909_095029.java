// Last updated: 09/09/2026, 09:50:29
1class Solution {
2    public boolean wordPattern(String pattern, String str) {
3        String[] words=str.split(" ");
4        if(words.length!= pattern.length())
5            return false;
6        Map<Object, Integer> index = new HashMap<>(); 
7        for (Integer i = 0; i < words.length; i++) {
8            if (!Objects.equals(index.put(pattern.charAt(i), i), index.put(words[i], i))) {
9               return false;
10            }
11        }
12        return true;
13    }
14}