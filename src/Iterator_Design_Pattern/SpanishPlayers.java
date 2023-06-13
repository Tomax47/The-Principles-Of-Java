package Iterator_Design_Pattern;

import java.util.Hashtable;
import java.util.Iterator;

public class SpanishPlayers implements PlayerIterator{

    private Hashtable<Integer, PlayerProfile> players = new Hashtable<>();

    public SpanishPlayers() {}

    int hashKey = 0;
    public void addPlayer(String name,String surname, int age,String nationality, boolean retired) {
        PlayerProfile newPlayer = new PlayerProfile(name,surname,age,nationality,retired);
        this.players.put(hashKey,newPlayer);
        hashKey++;
    }

    @Override
    public Iterator createIterator() {
        return players.values().iterator();
    }
}
