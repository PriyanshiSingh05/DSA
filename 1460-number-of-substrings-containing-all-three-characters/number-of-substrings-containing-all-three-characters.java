class Solution {
    public int numberOfSubstrings(String s) {
                int n = s.length();

        int left = 0;
        int count = 0;

        int[] freq = new int[3];   // freq[0] = a, freq[1] = b, freq[2] = c

        for (int right = 0; right < n; right++) {

            // include current right character
            freq[s.charAt(right) - 'a']++;

            // while window is valid, keep shrinking from left
            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {

                // all substrings from (left..right) to (left..n-1) are valid
                count += (n - right);

                // remove left char and move left
                freq[s.charAt(left) - 'a']--;
                left++;
            }
        }

        return count;

        
    }
}