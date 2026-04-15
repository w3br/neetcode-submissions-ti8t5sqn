class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int globalMax = 0;
        int count = 0;

        if (nums[0] == 1) {
            globalMax = 1;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                globalMax = Math.max(count, globalMax);
            } else {
                count = 0;
            }

        }

        return globalMax;
    }
}