// Last updated: 22/09/2026, 09:07:15
1class Solution {
2    public int uniqueMorseRepresentations(String[] words) {
3        String[] morseMapping = {
4            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 
5            ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", 
6            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
7        };
8        HashSet<String> s=new HashSet<>();
9        for(String w:words){
10            StringBuilder sb=new StringBuilder();
11            for(char c:w.toCharArray()){
12                sb.append(morseMapping[c-'a']);
13            }
14            s.add(sb.toString());
15        }
16        return s.size();
17    }
18}