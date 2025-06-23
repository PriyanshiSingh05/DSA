import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character,Character> map = new HashMap<>();
        HashMap<Character,Character> reverse = new HashMap<>();
        for(int i = 0 ; i < s.length(); i ++){
            char original = s.charAt(i);
            char replacement = t.charAt(i);

            if(map.containsKey(original)){
                if(map.get(original)!=replacement)
                return false;
            }else{
                if(reverse.containsKey(replacement)){//2 values 1 key
                    return false;
                }
                map.put(original,replacement);
                reverse.put(replacement, original);
            }
        }return true;

    }
}
