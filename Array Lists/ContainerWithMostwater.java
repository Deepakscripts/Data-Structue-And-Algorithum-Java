import java.util.*;

public class ContainerWithMostwater {

    public static int storeWater(ArrayList<Integer> height){
        int maxWater = 0;
        /* BRUTE FORCE O(n^2)*/
        for(int i = 0; i < height.size(); i++){
            for(int j = i+1; j<height.size(); j++){
                int ht = Math.min(height.get(i), height.get(j));
                int width = j-i;
                int CurrentWater = ht * width;
                maxWater = Math.max(maxWater, CurrentWater);
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        /* INITIALIZE */
        ArrayList<Integer> height = new ArrayList<>();
        /* ADD HEIGHT */
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        int result  = storeWater(height);
        System.out.print(result);

    }
}
