class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxlen = 0 ;

       

        for(int i = 0 ; i < n ; i++){
            
            int[] hashA = new int[256];
            Arrays.fill(hashA, 0);

            for(int j = i ; j < n; j++){
                if(hashA[s.charAt(j)]== 1) break;
                hashA[s.charAt(j)] = 1;

                int len = j -i +1;
                maxlen = Math.max(len ,maxlen);

            }
        }
        return maxlen;
    }
}