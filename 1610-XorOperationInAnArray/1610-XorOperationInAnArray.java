// Last updated: 09/07/2026, 15:07:30
class Solution {
    public int xorOperation(int n, int start) {
        int res=0;
        for(int i=0;i<n;i++){
            res^=(start+2*i);
        }
        return res;
    }
}