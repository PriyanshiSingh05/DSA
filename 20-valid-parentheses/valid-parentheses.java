class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for(char i : s.toCharArray()){
            if(i == '(' || i == '{' || i =='['){
                st.push(i);
            }
            else{
                if(st.isEmpty()) return false;

                char ch = st.pop();
                if( (ch=='(' && i ==')') || (ch=='{' && i == '}') || (ch=='[' && i == ']') ){
                //this means its a match
                continue;
                }
               //if its a mismatch 
               return false; 
            }
        }return st.isEmpty();
        
    }
}