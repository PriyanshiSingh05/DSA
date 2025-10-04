class Solution {
    // Finding the minimum
    // STEP 1 : Find nse
    private int[] findNSE(int[] nums){
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];

        for(int i = n-1; i >=0; i--){
            while(!st.isEmpty() && nums[st.peek()] >= nums[i]){
                st.pop();
            }
            ans[i] = !st.isEmpty() ? st.peek() : n;
            st.push(i);
        }
        return ans;

    }
    // STEP 2: FIND PSE or =
     private int[] findPSEE(int[] nums){
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];

        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && nums[st.peek()] > nums[i]){
                st.pop();
            }
            ans[i] = !st.isEmpty() ? st.peek() : -1;
            st.push(i);
        }
        return ans;

    }

    //FINDING MAXIMUM
    //step 1 : NGE
     private int[] findNGE(int[] nums){
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];

        for(int i = n-1; i >=0; i--){
            while(!st.isEmpty() && nums[st.peek()] <= nums[i]){
                st.pop();
            }
            ans[i] = !st.isEmpty() ? st.peek(): n;
            st.push(i);
        }
        return ans;

    }
    //STEP 2: FINDING PGEE
     private int[] findPGEE(int[] nums){
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];

        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && nums[st.peek()] < nums[i]){
                st.pop();
            }
            ans[i] = !st.isEmpty() ? st.peek() : -1;
            st.push(i);
        }
        return ans;

    }
    // Function to compute subarray minimums STEP 3:
    private long sumSubarrayMins(int[] nums){
        int n = nums.length;
        int[] nse = findNSE(nums);
        int[] psee = findPSEE(nums);
        
        long sum = 0;
        for(int i = 0 ; i < n; i ++){
            long left = i - psee[i];
            long right = nse[i] - i ;
            sum= (sum + nums[i] * left*right *1L);

        }
        return sum;
        
    }

    // Function to compute subarray maximums STEP 3:
    private long sumSubarrayMaxs(int[] nums){
        int n = nums.length;
        int[] nge = findNGE(nums);
        int[] pgee = findPGEE(nums);
        
        long sum = 0;
        for(int i = 0 ; i < n; i ++){
            long left = i - pgee[i];
            long right = nge[i] - i ;
            sum= (sum + nums[i] * left*right*1L);

        }
        return sum;
        
    }


    public long subArrayRanges(int[] nums) {
        return sumSubarrayMaxs(nums) - sumSubarrayMins(nums);

        
    }
}