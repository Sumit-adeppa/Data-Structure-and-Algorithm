class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        int low = 1, high = x, ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long square = (long) mid * mid;
            if (square == x) {
                return mid;
            } else if (square < x) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}

/*
function mySqrt(x):

    if x == 0:
        return 0

    low = 1
    high = x
    ans = 0

    while low <= high:

        mid = low + (high - low) / 2

        if mid * mid == x:
            return mid

        else if mid * mid < x:
            ans = mid
            low = mid + 1

        else:
            high = mid - 1

    return ans
*/