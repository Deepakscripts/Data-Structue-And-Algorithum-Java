public class Interfaces {
    public static void main(String[] args) {
        Queen q1 = new Queen();
        q1.moves();
        King k1 = new King();
        k1.moves();
    }
}

interface chessPlayer {
    void moves();
}

class Queen implements chessPlayer {
    public void moves() {
        System.out.println("Queen moves");
    }
}

class King implements chessPlayer {
    public void moves() {
        System.out.println("King moves");
    }
}
