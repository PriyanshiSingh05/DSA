class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numset = new HashSet<>();
        for(int a : nums){
            if(numset.contains(a)){
                return true;
            }
            numset.add(a);
        }
       
       return false;
        
    }
}