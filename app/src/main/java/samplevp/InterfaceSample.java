package samplevp;

import java.util.ArrayList;

public class InterfaceSample {
    public InterfaceSample() {
        ArrayList<PlayerPlaying> players = new ArrayList<PlayerPlaying>();
        PlayerAdmin admin = new Player();
        admin.EditName("John");
        System.out.println(admin.getMovesLeft());
        System.out.println(admin.Move());
        PlayerPlaying play = (PlayerPlaying) admin;
        players.add(play);

        PlayerPlaying play2 = new PlayAround();
        players.add(play2);

        for (PlayerPlaying p : players) {
            System.out.print(p.Move());
            System.out.println(" moves left for " + p.getName());
        }

    }

}
