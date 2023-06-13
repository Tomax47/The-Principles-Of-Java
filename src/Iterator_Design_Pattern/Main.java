package Iterator_Design_Pattern;

/**
 The iterator allows us to traverse Arrays/ArrayLists, Hashtable, Stacks, Queues and trees all together without the need for creating
 separate methods for each one, plus it encapsulates the data of the traversed Data type, like the index of the element in the array fe.
 */
public class Main {
    public static void main(String[] args) {

        BrazilianPlayers brazilianPlayers = new BrazilianPlayers();
        brazilianPlayers.addPlayer("Neymar","JR",33,"Brazil",false);
        brazilianPlayers.addPlayer("Carols","Casimiro",31,"Brazil",false);
        brazilianPlayers.addPlayer("Recardo","Kaka",41,"Brazil",true);

        ArgentinianPlayers argentinianPlayers = new ArgentinianPlayers(2);
        argentinianPlayers.addPlayer("Lionel", "Messi", 36,"Argentina",false);
        argentinianPlayers.addPlayer("Angel","Di Maria",35,"Argentina",false);

        SpanishPlayers spanishPlayers = new SpanishPlayers();
        spanishPlayers.addPlayer("Andres","Iniesta",39,"Spain",true);
        spanishPlayers.addPlayer("Sergio","Busquets",34,"Spain",false);
        spanishPlayers.addPlayer("Carles","Puyol",45,"Spain",true);

        BestPlayersListing bestPlayersListing = new BestPlayersListing(brazilianPlayers,argentinianPlayers,spanishPlayers);
        bestPlayersListing.getBestPlayers();
    }
}
