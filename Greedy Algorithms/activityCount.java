import java.util.*;

public class activityCount {
    public static int countActivities(int start[], int end[], ArrayList<Integer> ans, int activities[][]) {
        if (start.length == 0 || end.length == 0 || start.length != end.length) {
            return 0; // If either arrays are empty or have different lengths, no activities can be
                      // performed
        }

        // Sorting
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i; // index
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        //end time basis sorted
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        int count = 1; // At least one activity can be performed

        // Select the first activity (activity with the earliest end time)
        ans.add(activities[0][0]);
        int prevEnd = activities[0][2];
        for (int i = 1; i < start.length; i++) {
            // If the current activity's start time is greater than or equal to the end time
            // of the previously selected activity, select this activity and update the end
            // time
            // of the selected activity and increase the count
            if (activities[i][1] >= prevEnd) {
                count++;
                ans.add(activities[i][0]);
                prevEnd = activities[i][2]; // Update to the end time of the current activity
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 }; 
        // end time is sorted
        int end[] = { 9, 9, 7, 6, 4, 2 };
       /*  int end[] = { 2, 4, 6, 7, 9, 9 }; */
        ArrayList<Integer> ans = new ArrayList<>();
        int activities[][] = new int[start.length][3];
        int result = countActivities(start, end, ans, activities);
        System.out.println("Total activities which can be performed without overlapping are " + result);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println("Activity no." + ans.get(i));
        }
        System.out.println();
    }
}
