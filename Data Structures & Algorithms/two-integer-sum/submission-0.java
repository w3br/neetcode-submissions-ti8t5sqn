class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> lookup = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++){
            int difference = target - nums[i];
            if (lookup.containsKey(difference)){
                return new int[] {lookup.get(difference), i};
            }
            lookup.put(nums[i], i);
        }

        return new int [] {};
    }
}
