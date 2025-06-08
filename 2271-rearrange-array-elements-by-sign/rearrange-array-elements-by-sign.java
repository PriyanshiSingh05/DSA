class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int pos = 0;
        int neg=1;
        int[] ans = new int[n];
        for(int ele:nums){
            if(ele > 0){
                ans[pos] = ele;
                pos+=2;

            }else{
                ans[neg] = ele;
                neg+=2;
            }

        }return ans;
       
        
    }
}