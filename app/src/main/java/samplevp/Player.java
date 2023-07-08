package samplevp;

public class Player implements PlayerAdmin, PlayerPlaying {

    int moves = 10;
    String name = "First name";

    public int Move() {
        moves--;
        return moves;
    }

    public void EditName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getMovesLeft() {
        return moves;
    }

}
