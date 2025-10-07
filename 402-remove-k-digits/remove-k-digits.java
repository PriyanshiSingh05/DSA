class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        Stack<Integer> st = new Stack<>();

       //edge case 1 handling
       if(k==n) return "0";

       for(int i = 0 ; i < n ; i++){
        int digit = num.charAt(i) - '0';

        while(!st.isEmpty() && k>0 && st.peek() > digit){
            st.pop();
            k--;
        }
        st.push(digit);// this is common so it makes sure that baad ki digits r also pushed 
       
       }
        // 3rd edge case : no digit is removed from stack then remove last k digits
        while(k > 0 && !st.isEmpty()){
            st.pop();
            k--; // termination condition for while loop;
        }

        StringBuilder result = new StringBuilder();

        while(!st.isEmpty()){
            result.append(st.pop());
        }
        result.reverse();

        //2nd edge case leading zeros
        while(result.length() > 1 && result.charAt(0) =='0'){
            result.deleteCharAt(0);
        }
        return result.toString();
    }
}
