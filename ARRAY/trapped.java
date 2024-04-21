public class trapped {

    public static int trapperWater(int[] height) {
        int n = height.length;
        /* CALCULATE MAX LEFT FOR EACH */
        int maxLeft[] = new int[n];
        maxLeft[0] = height[0];
        for (int i = 1; i < n; i++) {
            maxLeft[i] = Math.max(height[i], maxLeft[i - 1]);
        }

        /* CALCULATE MAX FOR RIGHT */
        int maxRight[] = new int[n];
        maxRight[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxRight[i] = Math.max(height[i], maxRight[i + 1]);

        }

        /* WATERLEVEL = MIN VALUE OF MAX RIGHT AND MAX LEFT */
        int trapperWater = 0;
        /* LOOP FOR CALCULATION */
        for (int i = 0; i < n; i++) {
            int WATERLEVEL = Math.min(maxLeft[i], maxRight[i]);
            trapperWater = trapperWater + WATERLEVEL - height[i];
        }
        return trapperWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        int result = trapperWater(height);
        System.out.println(result);
    }
}
