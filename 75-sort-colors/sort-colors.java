class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int mid = 0;
        int end = nums.length -1;
        while(mid <= end){
            switch(nums[mid]){
                case 0 :
                swap(nums, start,mid);
                mid++;
                start++;
                break;
                case 1:
                mid++;
                break;
                case 2:
                swap(nums,mid,end);
                end--;
                
            }
        }
    } 
    private static void swap(int[] nums ,int a, int b){
        int temp = nums[a];
        nums[a]= nums[b];
        nums[b] = temp;
    }
}