class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
    }
}
/*
| Price | Min Price | Profit | Max Profit |
| ----- | --------- | ------ | ---------- |
| 7     | 7         | 0      | 0          |
| 1     | 1         | 0      | 0          |
| 5     | 1         | 4      | 4          |
| 3     | 1         | 2      | 4          |
| 6     | 1         | 5      | 5          |
| 4     | 1         | 3      | 5          |

*/