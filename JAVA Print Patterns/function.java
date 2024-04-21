/* import java.util.*; */

public class function {

    
        public static int add(int a, int b) {
            return a + b;
        }

        public static float add(float a, float b) {
            return a + b;
        }

        public static String add(String a, String b) {
            return a + b;
        }
        

    public static void main(String[] args) {


        System.out.println(add(1, 2)); // This will call the first add() method
        System.out.println(add(1.5f, 2.5f)); // This will call the second add() method
        System.out.println(add("Hello", "World!")); // This will call the third add() method
    }
}
