// Last updated: 09/07/2026, 15:05:24
class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        boolean[] light=new boolean[101];
        for(int b:bulbs){
            light[b]=!light[b];
        }
        List<Integer>result=new ArrayList<>();
        for(int i=1;i<=100;i++){
            if(light[i]){
                result.add(i);
            }
        }
        return result;
    }
}