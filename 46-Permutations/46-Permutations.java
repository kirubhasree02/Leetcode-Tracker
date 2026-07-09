// Last updated: 09/07/2026, 15:14:08
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        backtrack(res,new ArrayList<>(),nums);
        return res;
    }
    private void backtrack(List<List<Integer>> res,List<Integer> currentlist,int[]nums){
        if(currentlist.size()==nums.length){
        res.add(new ArrayList<>(currentlist));
        return;
        }
        for(int i=0;i<nums.length;i++){
            if(currentlist.contains(nums[i])) continue;
            currentlist.add(nums[i]);
            backtrack(res,currentlist,nums);
            currentlist.remove(currentlist.size()-1);
        }
    }
}