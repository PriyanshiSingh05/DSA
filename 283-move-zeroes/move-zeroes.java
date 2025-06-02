class Solution {
    public void moveZeroes(int[] nums) {
        // create a temp 
        int n = nums.length;
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            if(nums[i]!= 0 ){
                temp.add(nums[i]);            }
        }//copy non zero elements back to original array
        for(int i =0;i<temp.size();i++){
            nums[i] = temp.get(i);

        } 
        for(int i = temp.size() ; i<n ;i++){
            nums[i]=0;
        }
             // fill the remaining place in original array with 0s
     }
}