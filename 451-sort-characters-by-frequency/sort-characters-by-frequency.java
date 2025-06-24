
class Solution {
    public String frequencySort(String s) {
    //frequency map
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0) + 1);

        }
        //convert map to list and then sort;
        List<Map.Entry<Character,Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((a,b) -> b.getValue() - a.getValue());

        StringBuilder result = new StringBuilder();
        for(Map.Entry<Character,Integer> entry : entryList){
            char ch = entry.getKey();
            int count = entry.getValue();

            for(int i = 0 ; i < count;i++){
                result.append(ch);
            }

        }return result.toString();



         
        
    }
}