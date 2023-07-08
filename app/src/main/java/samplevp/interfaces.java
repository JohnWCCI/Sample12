package samplevp;

interface PlayerAdmin  extends PlayerPlaying{
    void EditName(String newName);
    int getMovesLeft();
}

interface PlayerPlaying {
    int Move();
    String getName();
}
