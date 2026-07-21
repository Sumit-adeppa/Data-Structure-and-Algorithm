class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        backtracking(nums, result, new ArrayList<>(),  used);
        return result;
    }
    //Helper Function
    public static void backtracking(int[] nums, List<List<Integer>> result, List<Integer> current, boolean[] used) {
        // Base Case
        if(current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        //Recursion
        for (int i = 0; i < nums.length; i++) {
           if (used[i]) {
            continue;
           }
           // Choose
           current.add(nums[i]);
           used[i] = true;

            // Explore
           backtracking(nums, result, current, used);

            // Backtrack
           current.remove(current.size() - 1);
           used[i] = false;
        }
    }
}
