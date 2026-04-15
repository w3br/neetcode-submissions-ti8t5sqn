class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int n : nums){
            if (!m.containsKey(n)){
                m.put(n,1);
            } else {
                return true;
            }
        }
        return false;
    }
}