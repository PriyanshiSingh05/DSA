class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length -1;
        int ans= Integer.MAX_VALUE;
        while(start <=end){
            int mid = start +(end - start)/2;
            //sorted half find
            if(nums[start] <= nums[mid]){
                ans = Math.min(ans,nums[start]);
                //eliminate now
                start = mid+1;


            }else{//if right is sorted then min is mid
                ans = Math.min(ans,nums[mid]);
                end = mid -1;
            }
        }return ans;
        
    }
}