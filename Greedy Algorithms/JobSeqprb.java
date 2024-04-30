import java.util.*;

public class JobSeqprb {

    static class Job {
        int deadline;
        int profit;
        int id;

        public Job(int id, int deadline, int profit) {
            this.id = id; // Corrected assignment statements
            this.profit = profit; // Corrected assignment statements
            this.deadline = deadline; // Corrected assignment statements
        }
    }

    public static void main(String[] args) {
        int jobInfo[][] = {
                { 4, 20 },
                { 1, 10 },
                { 1, 40 },
                { 1, 30 }
        };
        // arrayList of objects
        ArrayList<Job> jobs = new ArrayList<>();
        // creating object
        for (int i = 0; i < jobInfo.length; i++) {
            jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
        }
        // sorting objects in descending order
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);

        ArrayList<Integer> seq = new ArrayList<>();
        ArrayList<Integer> kamai = new ArrayList<>();
        int time = 0;
        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if (curr.deadline > time) {
                seq.add(curr.id);
                kamai.add(curr.profit);
                time++;
            }
        }
        System.out.println("Maximum jobs that can be done with maximum profit are " + seq.size());
        System.out.println();
        for (int i = 0; i < seq.size(); i++) {
            System.out.println("They are " + seq.get(i) + " ");
        }
        System.out.println();
        int kamai1 = 0;
        for (int i = 0; i < kamai.size(); i++) {
            
           kamai1 +=  kamai.get(i);
        }
        System.out.println("Maximum profit is " + kamai1);

    }
}
