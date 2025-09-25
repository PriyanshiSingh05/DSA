class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] nge = new int[n];
        for(int i = 0 ; i < n ;i++){
            nge[i] = -1;
            for(int j = 0 ; j < n ; j++){
               int idx = (i+j) % n; 
               if(nums[i] <nums[idx]){
                nge[i]= nums[idx];
                break;
               }
            }

        }return nge;
    }
}