
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        int n = nums.length;
        
        for(int i = 0 ; i < n; i++){
            int diff = target - nums[i];
            if(!map.containsKey(diff)){
                map.put(nums[i], i);
            }else{
                ans[0] = map.get(diff);
                ans[1] = i;
                return ans;
            }
        }
        return ans;
       
    }
}

