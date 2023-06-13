package Iterator_Design_Pattern;
import lombok.Data;
import java.util.ArrayList;
import java.util.Iterator;

/**
  The players here are in an arrayList
 */
@Data
public class BrazilianPlayers implements PlayerIterator{

    private ArrayList<PlayerProfile> players;

    public BrazilianPlayers() {
        players = new ArrayList<>();
    }


    public void addPlayer(String name,String surname, int age,String nationality, boolean retired) {
        PlayerProfile newPlayer = new PlayerProfile(name,surname,age,nationality,retired);
        this.players.add(newPlayer);
    }

    @Override
    public Iterator createIterator() {
        return players.iterator();
    }
}
