public class comapreTo {
    public static void main(String[] args) {
        String names [] = {"deepak", "neha", "baba", "rishabh", "ayush", "priyanshu"};

        String largest = names[0];
        for(int i=1; i<names.length; i++){
            if (largest.compareTo(names[i]) < 0) {
                /* CURRENT NAME IS GREATER THAN LARGEST */
                largest = names[i];
            }
        }
        System.out.println(largest);
    }
}
