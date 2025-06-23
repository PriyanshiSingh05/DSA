class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        // hashmap frequency
        HashMap<Character, Integer> map = new HashMap<>();
        for(char p : s.toCharArray()){
            map.put(p,map.getOrDefault(p,0)+1);
        }
        for(char p : t.toCharArray()){
            if(!map.containsKey(p)){
                return false;
            }
            //reduce count
            map.put(p,map.get(p)-1);
            if(map.get(p)<0) return false;//very imp check
        }return true;

    }
}