package Iterator_Design_Pattern;

import java.util.Iterator;

public class BestPlayersListing {

    private PlayerIterator BrazilianPlayers;
    private PlayerIterator ArgentinianPlayers;
    private PlayerIterator SpanishPlayers;

    public BestPlayersListing(PlayerIterator brazilianPlayers, PlayerIterator argentinianPlayers, PlayerIterator spanishPlayers) {
        BrazilianPlayers = brazilianPlayers;
        ArgentinianPlayers = argentinianPlayers;
        SpanishPlayers = spanishPlayers;
    }

    public void getBestPlayers(){
        Iterator getBrazilianPLayers = BrazilianPlayers.createIterator();
        Iterator getArgentinianPlayers = ArgentinianPlayers.createIterator();
        Iterator getSpanishPlayers = SpanishPlayers.createIterator();

        System.out.println("Legends of Brazil : ");
        printPLayersInfo(getBrazilianPLayers);

        System.out.println("\nLegends of Argentina : ");
        printPLayersInfo(getArgentinianPlayers);

        System.out.println("\nLegends of Spain : ");
        printPLayersInfo(getSpanishPlayers);
    }

    public void printPLayersInfo(Iterator iterator) {
        while (iterator.hasNext()) {
            var player = iterator.next();
            System.out.println(player);

            /**
             The above written implementation gives the same value as the following one :

                PlayerProfile playerProfile = (PlayerProfile) iterator.next();
                System.out.println(playerProfile);

             */
        }
    }
}
