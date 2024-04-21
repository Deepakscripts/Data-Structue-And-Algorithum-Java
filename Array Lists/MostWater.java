import java.util.*;

public class MostWater {
    public static void main(String[] args) {
        // Initialize heights
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        // Initialize pointers
        int left = 0;
        int right = height.size() - 1;

        // Initialize variable to store max water
        int maxWater = 0;

        // Loop until pointers meet
        while (left < right) {
            // Calculate width of container
            int width = right - left;

            // Calculate height of container (minimum of the two heights)
            int minHeight = Math.min(height.get(left), height.get(right));

            // Calculate area of container
            int area = width * minHeight;

            // Update maxArea if current area is greater
            maxWater = Math.max(maxWater, area);

            // Move the pointer with lesser height towards the other pointer
            if (height.get(left) < height.get(right)) {
                left++;
            } else if (height.get(right) <= height.get(left)) {
                right--;
            }
        }

        // Print the max area
        System.out.println("Maximum area of water trapped: " + maxWater);
    }
}
