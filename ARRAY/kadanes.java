public class kadanes {

    public static void kdl( int [] numbers){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = 0; i< numbers.length; i++){
            currSum = currSum + numbers[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
            
        }
        System.out.println("MAXIMUM SUM = " + maxSum);
    }

    public static void main(String[] args) {
        int array[] = { 1, -2, -5, -10, 11, 20, 74 };
        kdl(array);
    }

}
