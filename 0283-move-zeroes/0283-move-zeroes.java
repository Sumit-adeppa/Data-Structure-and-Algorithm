class Solution {
    public void moveZeroes(int[] nums) {

        int write = 0;   // points to where next non-zero should go

        // Step 1: move all non-zero elements to the front
        for (int read = 0; read < nums.length; read++) {
            if (nums[read] != 0) {
                nums[write] = nums[read];
                write++;
            }
        }

        // Step 2: fill remaining positions with zero
        while (write < nums.length) {
            nums[write] = 0;
            write++;
        }
    }
}
