// Last updated: 15/09/2026, 09:12:51
1class Solution {
2    public String[] findRestaurant(String[] list1, String[] list2) {
3        Map<String,Integer> map=new HashMap<>();
4        List<String> res=new LinkedList<>();
5        int minSum=Integer.MAX_VALUE;
6        for(int i=0;i<list1.length;i++){
7            map.put(list1[i],i);
8        }
9        for(int i=0;i<list2.length;i++){
10            Integer j=map.get(list2[i]);
11            if(j!=null && i+j<=minSum){
12                if(i+j<minSum){
13                    res.clear();
14                    minSum=i+j;
15                }
16                res.add(list2[i]);
17            }
18        }
19        return res.toArray(new String[res.size()]);
20    }
21}