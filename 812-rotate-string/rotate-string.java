class Solution {
    public boolean rotateString(String s, String goal) {
      int n = s.length();
      //rotate pick up first element 
      //store it dlete it paste it end

      if(s.length()!= goal.length()) return false;

      StringBuilder sb = new StringBuilder(s);
      while(n-->0){

        if(sb.toString().equals(goal)) return true;
        
        char first = sb.charAt(0);
        sb.deleteCharAt(0);
        sb.append(first);
        
      }return false;

    }
}