class Solution {
    public int LargestAreaHistorgram(int[] heights){
        Stack<Integer> st = new Stack<>();
        int maxArea = 0 ;
        int n = heights.length;
        int nse , pse ;

        for(int i = 0 ; i < n; i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                int element = heights[st.pop()];
                nse = i;
                pse = st.isEmpty() ? -1 : st.peek();
                maxArea = Math.max(maxArea , element * (nse - pse - 1));
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int element = heights[st.pop()];
            nse = n ;
            pse = st.isEmpty() ? -1 : st.peek();
            maxArea = Math.max(maxArea , element * (nse - pse - 1));
        }
        return maxArea;
    }

    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] prefixSum = new int [n][m];

        for(int j = 0 ; j < m ; j++){
            int sum = 0 ;
            for(int i = 0; i < n; i++){
                
                int val =matrix[i][j] - '0'; // char change
                
                if(val == 0){
                    prefixSum[i][j] = 0;
                    sum = 0;
                }else{
                    sum += 1;
                    prefixSum[i][j] = sum;
                }
            }
        }
        int largestA = 0 ; // final ans
        // traversing each row of prefixsum matrux
        for(int i = 0 ; i < n ; i ++){
            largestA = Math.max( largestA , LargestAreaHistorgram(prefixSum[i]));
        }
        return largestA;       
    }
}