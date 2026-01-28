class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atmostK(nums , k) - atmostK(nums , k -1 );
     


    }
    public int atmostK(int[] nums , int k ){
        
        int left = 0;
        int count = 0 ;

        for(int right = 0 ; right < nums.length ; right++){
            if(nums[right] % 2 != 0){
                k--;
            }
            // shrink window till k is valid 
            while(k < 0){
                if(nums[left] % 2 != 0){
                    k++;

                }
                left++;         
            }
            count += (right - left + 1);
        } 
        return count ;
    }
}