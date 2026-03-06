class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numset = new HashSet<>();
        for(int a : nums){
            numset.add(a);
        }
        return numset.size() < nums.length;
        
    }
}