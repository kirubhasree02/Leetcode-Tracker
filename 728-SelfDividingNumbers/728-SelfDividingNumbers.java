// Last updated: 09/07/2026, 15:08:51
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isSelfDividing(i)){
                list.add(i);
            }
        }
        return list;
    }
    public static boolean isSelfDividing(int num){
        int org=num;
        while(num>0){
            int d=num%10;
            if(d==0) return false;
            if(org%d!=0) return false;
            num/=10;
        }
        return true;
    }
}