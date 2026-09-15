// Last updated: 15/09/2026, 15:14:57
1public class Solution {
2    public boolean isValid(String code) {
3        Stack<String> stack = new Stack<>();
4        for(int i = 0; i < code.length();){
5            if(i>0 && stack.isEmpty()) return false;
6            if(code.startsWith("<![CDATA[", i)){
7                int j = i+9;
8                i = code.indexOf("]]>", j);
9                if(i < 0) return false;
10                i += 3;
11            }else if(code.startsWith("</", i)){
12                int j = i + 2;
13                i = code.indexOf('>', j);
14                if(i < 0 || i == j || i - j > 9) return false;
15                for(int k = j; k < i; k++){
16                    if(!Character.isUpperCase(code.charAt(k))) return false;
17                }
18                String s = code.substring(j, i++);
19                if(stack.isEmpty() || !stack.pop().equals(s)) return false;
20            }else if(code.startsWith("<", i)){
21                int j = i + 1;
22                i = code.indexOf('>', j);
23                if(i < 0 || i == j || i - j > 9) return false;
24                for(int k = j; k < i; k++){
25                    if(!Character.isUpperCase(code.charAt(k))) return false;
26                }
27                String s = code.substring(j, i++);
28                stack.push(s);
29            }else{
30                i++;
31            }
32        }
33        return stack.isEmpty();
34    }
35}