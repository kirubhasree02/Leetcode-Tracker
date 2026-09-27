// Last updated: 27/09/2026, 11:48:22
1
2
3public class Solution {
4    public List<List<Integer>> fourSum(int[] nums, int target) {
5        // Use a Set to automatically handle and remove duplicate quadruplets
6        Set<List<Integer>> uniqueQuadruplets = new HashSet<>();
7        
8        // Sorting helps keep the numbers inside the quadruplets in order
9        // This ensures the Set can accurately identify duplicates
10        Arrays.sort(nums);
11        int n = nums.length;
12
13        // Loop 1: Pick the first number
14        for (int i = 0; i < n; i++) {
15            // Loop 2: Pick the second number
16            for (int j = i + 1; j < n; j++) {
17                
18                // A Set to store numbers we see *between* the second number and the end of the array
19                Set<Long> seenNumbers = new HashSet<>();
20                
21                // Loop 3: Scan the rest of the array to find the remaining two numbers
22                for (int k = j + 1; k < n; k++) {
23                    // Calculate what the 4th number needs to be
24                    long remainingNeeded = (long) target - nums[i] - nums[j] - nums[k];
25
26                    // If we have already seen the needed 4th number, we found a valid quadruplet!
27                    if (seenNumbers.contains(remainingNeeded)) {
28                        List<Integer> quadruplet = Arrays.asList(nums[i], nums[j], (int) remainingNeeded, nums[k]);
29                        uniqueQuadruplets.add(quadruplet);
30                    }
31                    
32                    // Add the current number to our seen list for the next iterations
33                    seenNumbers.add((long) nums[k]);
34                }
35            }
36        }
37        
38        // Convert the Set back to the required List format
39        return new ArrayList<>(uniqueQuadruplets);
40    }
41}
42
43 