// Last updated: 04/10/2026, 16:47:51
1class Solution {
2    public String mostCommonWord(String p, String[] banned) {
3        Set<String> ban = new HashSet<>(Arrays.asList(banned));
4        Map<String,Integer> count=new HashMap<>();
5        String[] words=p.replaceAll("\\W+"," ").toLowerCase().split("\\s+");
6        for(String w:words) if(!ban.contains(w)) count.put(w,count.getOrDefault(w,0)+1);
7        return Collections.max(count.entrySet(),Map.Entry.comparingByValue()).getKey();
8    }
9}