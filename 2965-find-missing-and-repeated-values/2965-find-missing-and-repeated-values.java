class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int limit = n * n;

        int[] freq = new int[limit + 1];

        // Count frequencies
        for (int[] row : grid) {
            for (int num : row) {
                freq[num]++;
            }
        }

        int repeated = -1;
        int missing = -1;

        // Find repeated and missing numbers
        for (int num = 1; num <= limit; num++) {
            if (freq[num] == 2) {
                repeated = num;
            } else if (freq[num] == 0) {
                missing = num;
            }
        }

        return new int[]{repeated, missing};

    }
}