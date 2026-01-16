class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int left = 0 ;
        int maxlength = 0;
        HashMap<Integer , Integer> map  = new HashMap<>();


        for(int r= 0 ; r< n ; r++) {
            map.put(fruits[r] , map.getOrDefault(fruits[r] , 0) + 1);

            while(map.size() > 2){
                map.put(fruits[left] , map.get(fruits[left]) - 1);

                if(map.get(fruits[left])== 0){
                    map.remove(fruits[left]);
                }
                left++;
            }
            maxlength = Math.max(maxlength , r - left + 1);



        }
        return maxlength;


    }
}