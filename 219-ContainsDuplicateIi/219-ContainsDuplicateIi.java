// Last updated: 09/07/2026, 15:11:15
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> seen = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            if(seen.containsKey(val) && i-seen.get(val)<=k){
                return true;
            }
            seen.put(val,i);
        }
        return false;
    }
}