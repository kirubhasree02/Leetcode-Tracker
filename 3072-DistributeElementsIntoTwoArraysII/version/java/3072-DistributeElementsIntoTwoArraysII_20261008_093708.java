// Last updated: 08/10/2026, 09:37:08
1import java.util.*;
2
3class Solution {
4    public int[] resultArray(int[] nums) {
5        int n = nums.length;
6        List<Integer> arr1 = new ArrayList<>();
7        List<Integer> arr2 = new ArrayList<>();
8        List<Integer> sorted1 = new ArrayList<>();
9        List<Integer> sorted2 = new ArrayList<>();
10
11        arr1.add(nums[0]);
12        sorted1.add(nums[0]);
13        
14        arr2.add(nums[1]);
15        sorted2.add(nums[1]);
16
17        for (int i = 2; i < n; i++) {
18            int val = nums[i];
19            int gc1 = getGreaterCount(sorted1, val);
20            int gc2 = getGreaterCount(sorted2, val);
21
22            if (gc1 > gc2) {
23                arr1.add(val);
24                insertSorted(sorted1, val);
25            } else if (gc1 < gc2) {
26                arr2.add(val);
27                insertSorted(sorted2, val);
28            } else {
29                if (arr1.size() <= arr2.size()) {
30                    arr1.add(val);
31                    insertSorted(sorted1, val);
32                } else {
33                    arr2.add(val);
34                    insertSorted(sorted2, val);
35                }
36            }
37        }
38
39        int[] res = new int[n];
40        int index = 0;
41        for (int num : arr1) res[index++] = num;
42        for (int num : arr2) res[index++] = num;
43        return res;
44    }
45    private int getGreaterCount(List<Integer> sortedList, int val) {
46        int low = 0;
47        int high = sortedList.size() - 1;
48        int firstGreaterIndex = sortedList.size();
49
50        while (low <= high) {
51            int mid = low + (high - low) / 2;
52            if (sortedList.get(mid) > val) {
53                firstGreaterIndex = mid;
54                high = mid - 1; 
55            } else {
56                low = mid + 1;
57            }
58        }
59        return sortedList.size() - firstGreaterIndex;
60    }
61    private void insertSorted(List<Integer> sortedList, int val) {
62        int low = 0;
63        int high = sortedList.size() - 1;
64        int insertPos = sortedList.size();
65
66        while (low <= high) {
67            int mid = low + (high - low) / 2;
68            if (sortedList.get(mid) >= val) {
69                insertPos = mid;
70                high = mid - 1;
71            } else {
72                low = mid + 1;
73            }
74        }
75        sortedList.add(insertPos, val);
76    }
77}
78