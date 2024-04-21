public class stock {

    public static int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            /* PROFIT */
            if (buyPrice < prices[i]) {

                /* TODAY'S PROFIT */
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }

            else {
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] sellingPrice = { 7, 1, 5, 3, 6, 4 };
        int result = maxProfit(sellingPrice);
        System.out.println(result);
    }
}
