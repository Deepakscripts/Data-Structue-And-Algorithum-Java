import java.util.*;

public class javaBasics {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        float pen    = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();
        float cutter = sc.nextFloat();

        float sum = pen + pencil + eraser + cutter;

        float gst = sum * 118 / 100;
        System.out.println(gst);

        // Closing the Scanner object
        sc.close();

    }

}