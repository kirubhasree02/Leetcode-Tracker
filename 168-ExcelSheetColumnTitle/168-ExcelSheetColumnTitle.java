// Last updated: 09/07/2026, 15:12:11
class Solution {
    public String convertToTitle(int c) {
        StringBuffer res=new StringBuffer();
          while(c!=0){
            c--;
            int rem=c%26;
            char ch=(char)('A'+rem);
            res.append(ch);
            c/=26;
          }
          return res.reverse().toString();
    }
}