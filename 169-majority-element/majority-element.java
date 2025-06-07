class Solution {
    public int majorityElement(int[] nums) {
        int majorityE = nums[0];
        int votes = 1;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == majorityE ){
                votes++;
            }else {
                votes--;
                 if(votes==0){
                    majorityE = nums[i];
                    votes +=1;
                  
                }
            }
        }return majorityE;
    }   
}