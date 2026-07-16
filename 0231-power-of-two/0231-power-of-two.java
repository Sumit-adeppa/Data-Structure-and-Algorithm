class Solution {
    public boolean isPowerOfTwo(int n) {
        // Power of 2 must be positive.
        if (n <= 0) return false;
        // Base case: 2^0 = 1.
        if (n == 1) return true;
        // Odd numbers (except 1) cannot be powers of 2.
        if (n % 2 != 0) return false;
        // Recursively check the next smaller value.
        return isPowerOfTwo(n/2);
    }
}