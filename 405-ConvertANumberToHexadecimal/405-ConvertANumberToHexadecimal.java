// Last updated: 09/07/2026, 15:09:56
class Solution {
    public String toHex(int num) {
        if(num==0) return "0";
        char[] hex="0123456789abcdef".toCharArray();
        StringBuilder res=new StringBuilder();
         for(int i=0;i<8&&num!=0;i++){
            int c=num&15;
            res.append(hex[c]);
            num>>=4;
        }
        return res.reverse().toString();
    }
}