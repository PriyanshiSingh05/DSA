class Solution {
    public int characterReplacement(String s, int k) {
       int left = 0 ;
       int right = 0;
       int maxfreq = 0;
       int maxlength = 0;
       int[] freq = new int[26];
       

       while( right < s.length()){
        freq[s.charAt(right) - 'A']++;

        maxfreq = Math.max(maxfreq , freq[s.charAt(right)- 'A']);

            
        if((right - left + 1) - maxfreq > k){
            freq[s.charAt(left) - 'A']--;
            left++;
        }
        
        maxlength = Math.max(maxlength , right - left + 1);
        right++;


       }return maxlength;
        
    }
}