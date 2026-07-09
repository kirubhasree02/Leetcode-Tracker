// Last updated: 09/07/2026, 15:07:28
class Solution {
     public int countOdds(int low, int high) {
       int nums=high-low+1;  
       if(low%2!=0 && high%2!=0)  
            return nums/2 + 1;
        else
		return nums/2;
    }
}