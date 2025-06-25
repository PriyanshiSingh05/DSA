class Solution {
    public int myAtoi(String s) {
        s = s.trim(); // Remove leading/trailing spaces

        if (s.isEmpty()) {
            return 0;
        }

        int i = 0;
        int sign = 1;
        int n = s.length();
        long num = 0; // Use long to catch overflow before returning int

        // Handle optional sign
        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Process numeric characters
        while (i < n && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');

            // Check overflow before casting to int
            if (num * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (num * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int)(sign * num);
    }
}
