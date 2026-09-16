class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        TreeSet<Long> set = new TreeSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            long currentVal = (long) nums[i];
            
            // Find the smallest element in the set that is >= currentVal - valueDiff
            Long floorElement = set.ceiling(currentVal - valueDiff);
            
            // If such an element exists and is <= currentVal + valueDiff, we found our pair
            if (floorElement != null && floorElement <= currentVal + valueDiff) {
                return true;
            }
            
            // Add the current element to the sliding window
            set.add(currentVal);
            
            // Keep the window size bounded by indexDiff
            if (set.size() > indexDiff) {
                set.remove((long) nums[i - indexDiff]);
            }
        }
        
        return false;
    }
}