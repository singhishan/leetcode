class Solution {
        Integer[] dp;

        public int rob(int[] nums) {
            dp = new Integer[nums.length];
            return rob(nums, nums.length - 1);
        }

        private int rob(int[] nums, int i) {
            if (i < 0) return 0;
            if (dp[i] != null) return dp[i];
            return dp[i] = Math.max(rob(nums, i - 2) + nums[i], rob(nums, i - 1));
        }
    }