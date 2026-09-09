// Last updated: 09/09/2026, 09:56:37
1public class Solution {
2    public static List<String> findAllConcatenatedWordsInADict(String[] words) {
3        List<String> result = new ArrayList<>();
4        Set<String> preWords = new HashSet<>();
5        Arrays.sort(words, new Comparator<String>() {
6            public int compare (String s1, String s2) {
7                return s1.length() - s2.length();
8            }
9        });
10        
11        for (int i = 0; i < words.length; i++) {
12            if (canForm(words[i], preWords)) {
13                result.add(words[i]);
14            }
15            preWords.add(words[i]);
16        }
17        
18        return result;
19    }
20	
21    private static boolean canForm(String word, Set<String> dict) {
22        if (dict.isEmpty()) return false;
23	boolean[] dp = new boolean[word.length() + 1];
24	dp[0] = true;
25	for (int i = 1; i <= word.length(); i++) {
26	    for (int j = 0; j < i; j++) {
27		if (!dp[j]) continue;
28		if (dict.contains(word.substring(j, i))) {
29		    dp[i] = true;
30		    break;
31		}
32	    }
33	}
34	return dp[word.length()];
35    }
36}