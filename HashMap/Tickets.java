import java.util.*;

public class Tickets {
    public static String getStartPoint(HashMap<String, String> tickets) {
        HashMap<String, String> reverseMap = new HashMap<>();

        // to - from
        for (String key : tickets.keySet()) {
            reverseMap.put(tickets.get(key), key);
        }

        // to find statrting point
        for (String key : tickets.keySet()) {
            if (reverseMap.containsKey(key) == false) {
                return key;// starting point
            }
        }
        return null;
    }

    public static void main(String[] args) {
        // from - to
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");
        String key = getStartPoint(tickets);
        System.out.print(key);
        for (int i = 0; i < tickets.size(); i++) {
            System.out.print(" --> " + tickets.get(key));
            key = tickets.get(key);// updating key
        }
    }
}
