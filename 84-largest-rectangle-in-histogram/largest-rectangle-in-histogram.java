class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int maxA = 0 ;
        // now we ll calculate the pse using stack 

        for(int i = 0 ; i < n ; i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                int element = heights[st.pop()];
                
                int nse = i ;
                int pse = st.isEmpty() ? -1 : st.peek();
                maxA = Math.max(maxA, element * (nse-pse-1));               
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            // stack is not empty and elements are left 
            int element = heights[st.pop()];
            int nse = n;
            int pse = st.isEmpty()? -1 : st.peek();
            maxA = Math.max( maxA , element * (nse - pse -1));

        }
        return maxA;

    }        
    
}