class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int[] hashA = new int[256];
        Arrays.fill(hashA, -1);

        int l = 0 , r = 0 , maxlen = 0;
        while(r < n){
           if(hashA[s.charAt(r)] >= l){
            l = hashA[s.charAt(r)] + 1;
           }
           int len = r - l + 1;
           maxlen = Math.max(len, maxlen);
           hashA[s.charAt(r)] = r;
           r++;

        }
        return maxlen;  

    }
}