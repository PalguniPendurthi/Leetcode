class Solution {
    public int longestOnes(int[] nums, int k) {
        int ws = 0;  
        int maxLen = 0;  
        int zeroCount = 0;  

        for (int we = 0; we < nums.length; we++) {
            if (nums[we] == 0) {
                zeroCount++;
            }

            while (zeroCount > k) {
                if (nums[ws] == 0) {
                    zeroCount--;  
                }
                ws++;  
            }

            maxLen = Math.max(maxLen, we - ws + 1);
        }

        return maxLen;  
    }
}
