class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            // Odd length palindrome centered at i
            int len1 = Expand(s, i, i);
            // Even length palindrome centered between i and i+1
            int len2 = Expand(s, i, i + 1);

            int len = Math.max(len1, len2);

            // Update longest palindrome indices
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        // Corrected: substring, not toSubstring
        return s.substring(start, end + 1);
    }

    private int Expand(String s, int left, int right) {
        // Fixed while loop syntax
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Fixed return: correct length calculation
        return right - left - 1;
    }
}
