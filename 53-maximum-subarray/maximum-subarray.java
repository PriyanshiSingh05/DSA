class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max_Sum =nums[0];
        for(int i = 0 ; i < nums.length;i++){
            sum +=nums[i];
            if(sum > max_Sum){
                max_Sum = sum;
            }
            if(sum < 0 ){
                sum = 0;
            }
        } return max_Sum;
    }
}