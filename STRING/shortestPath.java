public class shortestPath {

    public static double shortestpath(String path) {

        int x = 0;
        int y = 0;

        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'N') {
                y++;
            } else if (path.charAt(i) == 'S') {
                y--;
            } else if (path.charAt(i) == 'E') {
                x++;
            } else if (path.charAt(i) == 'W') {
                x--;
            }

        }

        double X = Math.pow(x, 2);
        double Y = Math.pow(y, 2);

        double finalDisplacement = Math.sqrt(X + Y);
        return finalDisplacement;

    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        double displacement = shortestpath(path);
        System.out.println(displacement);
    }
}
