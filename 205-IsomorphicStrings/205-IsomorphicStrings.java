// Last updated: 09/07/2026, 15:11:21
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] index1=new int[200];
        int[] index2 =new int[200];
        int len=s.length();
        if(len!=t.length()){
            return false;
        }
        for(int i=0;i<len;i++){
            if(index1[s.charAt(i)]!=index2[t.charAt(i)]){
                return false;
            }
            index1[s.charAt(i)]=i+1;
            index2[t.charAt(i)]=i+1;
        }
        return true;
    }
}