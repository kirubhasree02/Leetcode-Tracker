// Last updated: 18/09/2026, 21:41:57
1class Solution {
2    public int maxProduct(String[] words) {
3        if(words==null||words.length==0) return 0;
4        int len=words.length;
5        int[] value=new int[len];
6        for(int i=0;i<len;i++){
7            String temp=words[i];
8            value[i]=0;
9            for(int j=0;j<temp.length();j++){
10                value[i]|=1<<(temp.charAt(j)-'a');
11            }
12        }
13        int maxProduct=0;
14        for(int i=0;i<len;i++){
15            for(int j=i+1;j<len;j++){
16                if((value[i]&value[j])==0 && (words[i].length()*words[j].length()>maxProduct))
17                maxProduct=words[i].length()*words[j].length();
18            }
19        }
20        return maxProduct;
21    }
22}