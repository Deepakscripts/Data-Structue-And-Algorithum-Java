import java.util.*;

public class NextGreater {
    public static void findNextGreater(int arr[], int nextGreater[]) {
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            // Reset stack for each element in arr
            while (!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }
            // If stack is empty, there's no greater element
            nextGreater[i] = s.isEmpty() ? -1 : s.peek();
            // Push current element to stack
            s.push(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        int nextGreater[] = new int[arr.length];
        findNextGreater(arr, nextGreater);
        for (int i = 0; i < nextGreater.length; i++) {
            System.out.print(nextGreater[i] + " ");
        }
    }
}
