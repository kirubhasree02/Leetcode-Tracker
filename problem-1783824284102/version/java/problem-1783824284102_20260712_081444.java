// Last updated: 12/07/2026, 08:14:44
1class Solution {
2    public int secondsBetweenTimes(String startTime, String endTime) {
3        int start=toSeconds(startTime);
4        int end=toSeconds(endTime);
5        return end-start;
6    }
7    private int toSeconds(String time){
8        int hours=Integer.parseInt(time.substring(0,2));
9        int mins=Integer.parseInt(time.substring(3,5));
10        int secs=Integer.parseInt(time.substring(6,8));
11        return hours*3600+mins*60+secs;
12    }
13}