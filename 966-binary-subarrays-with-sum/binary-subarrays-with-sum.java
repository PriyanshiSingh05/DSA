class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
      Map<Integer, Integer> prefixSumCount = new HashMap<>();

        // Initialize count and sum
        int count = 0, sum = 0;

        // Add base case: prefix sum 0 appears once
        prefixSumCount.put(0, 1);

        // Iterate through array
        for (int num : nums) {
            // Add current number to sum
            sum += num;

            // If (sum - goal) exists, add its count to result
            if (prefixSumCount.containsKey(sum - goal)) {
                count += prefixSumCount.get(sum - goal);
            }

            // Update prefix sum count
            prefixSumCount.put(sum, prefixSumCount.getOrDefault(sum, 0) + 1);
        }

        // Return final count
        return count;
    }
}