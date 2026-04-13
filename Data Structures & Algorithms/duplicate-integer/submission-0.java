class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> resultSet = new HashSet<Integer>();
        for (int n : nums){
            resultSet.add(n);
        }
        return resultSet.size()!= nums.length;
    }
}