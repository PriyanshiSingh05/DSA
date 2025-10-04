class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        List<Integer> li = new ArrayList<>();

        for(int i = 0 ; i < n; i++){ //positives
            if(asteroids[i] > 0){
                li.add(asteroids[i]);

            }
            else{ // negatives
            
                while(!li.isEmpty() && li.get(li.size()-1) > 0 && li.get(li.size()-1) <
                 Math.abs(asteroids[i])){
                    li.remove(li.size()-1);
                 }

                 if(!li.isEmpty() && li.get(li.size()-1) == Math.abs(asteroids[i])){
                    li.remove(li.size()-1);
                 }

                 else if(li.isEmpty() || li.get(li.size()-1) < 0){
                    li.add(asteroids[i]);
                 }
            }

        }
        int[] result = new int[li.size()];
        for(int i = 0 ; i < li.size(); i++){
            result[i] = li.get(i);
        }
        return result;

        

        
        
    }
}