// Last updated: 25/09/2026, 09:07:59
1class Solution {
2    public boolean isRectangleCover(int[][] rectangles) {
3        int minX=Integer.MAX_VALUE;
4        int minY=Integer.MAX_VALUE;
5        int maxX=Integer.MIN_VALUE;
6        int maxY=Integer.MIN_VALUE;
7        long total=0;
8        Set<String> cornerSet=new HashSet<>();
9        for(int[] rect:rectangles){
10            int x1=rect[0];
11            int y1=rect[1];
12            int x2=rect[2];
13            int y2=rect[3];
14            minX=Math.min(minX,x1);
15            minY=Math.min(minY,y1);
16            maxX=Math.max(maxX,x2);
17            maxY=Math.max(maxY,y2);
18            total+=(long)(x2-x1)*(y2-y1);
19            String[] corners = {
20                x1 + "," + y1,
21                x1 + "," + y2,
22                x2 + "," + y1,
23                x2 + "," + y2
24            };
25            for(String corner:corners){
26                if(!cornerSet.add(corner)){
27                    cornerSet.remove(corner);
28                }
29            }
30        }
31        if (cornerSet.size() != 4 || 
32            !cornerSet.contains(minX + "," + minY) || 
33            !cornerSet.contains(minX + "," + maxY) || 
34            !cornerSet.contains(maxX + "," + minY) || 
35            !cornerSet.contains(maxX + "," + maxY)) {
36            return false;
37        }
38        long area=(long)(maxX-minX)*(maxY-minY);
39        return total==area;
40    }
41}