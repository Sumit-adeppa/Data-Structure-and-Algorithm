class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, result, new ArrayList<>(), 0);
        return result;
    }
    //Helper Function
    static void backtrack(int[] nums, List<List<Integer>> result, List<Integer> current, int start) {
        // Base Case
        if (start == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        // Include current element
        current.add(nums[start]);
        backtrack(nums, result, current, start + 1);
        // Backtrack
        current.remove(current.size() - 1);
        // Exclude current element
        backtrack(nums, result, current, start + 1);
    }
}