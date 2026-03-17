import model.Deck;
import model.Player;

public class Main{
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.gerarBaralho();
        deck.Shuffle();

        Player player = new Player();

        player.receiveCard(deck.getCard());
        player.receiveCard(deck.getCard());
        System.out.println(player.getPlayerHand());
    }
}