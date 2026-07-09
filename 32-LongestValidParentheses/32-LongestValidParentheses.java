// Last updated: 09/07/2026, 15:14:30
class Solution {
    public int longestValidParentheses(String s) {
        LinkedList<Integer> stack=new LinkedList<>();
        int res=0;
        stack.push(-1);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')' && stack.size()>1 && s.charAt(stack.peek())=='('){
                stack.pop();
                res=Math.max(res,i-stack.peek());
            }else{
                stack.push(i);
            }
        }
        return res;
    }
}