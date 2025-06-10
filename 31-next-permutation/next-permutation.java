class Solution {
    public void nextPermutation(int[] nums) {
        int ind1 = -1;
        int n = nums.length;

        // Step 1: Find the break point
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind1 = i;
                break;
            }
        }

        // If no breakpoint, reverse entire array (last permutation → first)
        if (ind1 == -1) {
            reverse(nums, 0, n - 1);
            return; // Exit after full reversal
        }

        // Step 2: Find next greater element to swap
        for (int i = n - 1; i > ind1; i--) {
            if (nums[i] > nums[ind1]) {
                int temp = nums[i];
                nums[i] = nums[ind1];
                nums[ind1] = temp;
                break;
            }
        }

        // Step 3: Reverse the subarray after the break point
        reverse(nums, ind1 + 1, n - 1);
    }

    // Utility to reverse array from index start to end
    static void reverse(int[] nums, int start, int end) {
        while (start < end) { // remove the syntax error `<=`
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
