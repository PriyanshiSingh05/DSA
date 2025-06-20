class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int max = Integer.MIN_VALUE;

        // Find the maximum pile size
        for (int i = 0; i < piles.length; i++) {
            max = Math.max(piles[i], max);
        }

        int end = max;

        // Binary search on k (eating speed)
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int total = calculateTotalHours(piles, mid);

            if (total <= h) {
                end = mid - 1; // try smaller k for more potential ans
            } else {
                start = mid + 1; // need more speed
            }
        }

        return start; // the minimum k found
    }

    // Helper function to calculate total hours needed at speed k
    private int calculateTotalHours(int[] piles, int k) {
        int totalHours = 0;
        for (int i = 0; i < piles.length; i++) {
            totalHours += Math.ceil((double) piles[i] / k);
        }
        return totalHours;
    }
}
