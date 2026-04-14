class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] toReturn = new int [(nums.length)*2];

        for (int i = 0; i < nums.length; i++){
            toReturn[i] = nums[i];
            toReturn[nums.length + i] = nums[i];
        }

        return toReturn;
    }
}