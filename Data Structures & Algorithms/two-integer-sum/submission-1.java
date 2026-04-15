class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hm = new HashMap<>();
        int[] result = new int[2];
        
        for(int i = 0; i < nums.length; i++){
            if(hm.containsKey(target - nums[i])){
                result[0] = Math.min(i, hm.get(target-nums[i]));
                result[1] = Math.max(i, hm.get(target-nums[i]));
                return result;
            } else {
                hm.put(nums[i], i);
            }
        }

        return result;
    }
}
