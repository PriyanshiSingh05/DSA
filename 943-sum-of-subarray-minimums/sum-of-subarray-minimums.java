class Solution {

    private int[] findNSE(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Stack< Integer> st = new Stack<>();
        for(int i = n-1 ; i >=0;i--){
        while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
            st.pop();
        }
        ans[i] = !st.isEmpty() ? st.peek():n;
        st.push(i);
        }
        return ans;
    }
    private int[] findPSEE(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Stack< Integer> st = new Stack<>();
        for(int i = 0; i < n;i++){
        while(!st.isEmpty() && arr[st.peek()] > arr[i]){
            st.pop();
        }
        ans[i] = !st.isEmpty() ? st.peek():-1;
        st.push(i);
        }
        return ans;
    }

    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int[] nse = findNSE(arr);
        int[] psee = findPSEE(arr);
        long sum = 0;
        int mod = (int)1e9 +7;
        for(int i = 0 ; i < n ; i ++){

            long left = i - psee[i];
            long right = nse[i] - i;
            sum = ( sum + arr[i] * left * right) % mod;
        }
        return (int)sum;


       
        
    }
}