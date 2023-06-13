package Iterator_Design_Pattern;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

@Data
public class ArgentinianPlayers implements PlayerIterator{
    private  PlayerProfile[] players;

    public ArgentinianPlayers(int s) {
        players = new PlayerProfile[s];
    }


    int arrayValue = 0;

    public void addPlayer(String name,String surname, int age,String nationality, boolean retired){
        PlayerProfile newPlayer = new PlayerProfile(name,surname,age,nationality,retired);
        this.players[arrayValue] = newPlayer;
        arrayValue++;
    }

    @Override
    public Iterator createIterator() {
        return Arrays.asList(players).iterator();
    }
}
