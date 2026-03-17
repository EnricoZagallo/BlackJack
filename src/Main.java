import model.Dealer;
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
        System.out.println("Player hand " + player.getPlayerHand());

        Dealer dealer = new Dealer();
        dealer.receiveCard(deck.getCard());
        dealer.receiveCard(deck.getCard());
        System.out.println("Dealer hand " + dealer.getPlayerHand());

    }
}