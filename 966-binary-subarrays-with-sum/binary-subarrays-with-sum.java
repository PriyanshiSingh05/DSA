class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atmost(nums , goal) - atmost(nums , goal - 1); 
       
    }
    //less than equal to sum
    private int atmost(int[] nums , int goal){
        if(goal < 0) return 0 ;
        int left = 0;
        int sum = 0; 
        int count = 0;
        int right = 0;
        while(right < nums.length){
            sum += nums[right];

            while(sum > goal){
                // dec the window size
                sum -= nums[left];
                left++;
            }

            count += (right - left + 1);
            right++;
        }
        return count;

    }


}