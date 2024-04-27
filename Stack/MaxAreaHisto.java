import java.util.*;

public class MaxAreaHisto {
    public static void maxArea(int arr[]) {
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];
        // next smaller Right
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i > 0; i--) {
            // kuki bade vale ko hatana hai choa val jp bache vo boundary banega
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        // next smaller left
        s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            // kuki bade vale ko hatana hai choa val jp bache vo boundary banega
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = arr.length;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        // Current Area : width j - i - 1{nsr[i] - nsl[i] -1};
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int cuurArea = height * width;
            maxArea = Math.max(maxArea, cuurArea);
        }
        System.out.println("maxArea in histoigram is " + maxArea);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 2, 3 };// heights
        maxArea(arr);
    }
}
