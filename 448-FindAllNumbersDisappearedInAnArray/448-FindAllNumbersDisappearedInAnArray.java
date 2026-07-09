// Last updated: 09/07/2026, 15:09:43
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> number=new HashSet<>();
        for(int num:nums){
            number.add(num);
        }
        List<Integer> res=new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!number.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}