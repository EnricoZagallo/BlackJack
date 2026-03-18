import model.Dealer;
import model.Deck;
import model.Player;

public class Main{
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.gerarBaralho();
        deck.shuffle();




        Player player = new Player();
        String card1Player = deck.getCard();
        String card2Player = deck.getCard();
        player.receiveCard(card1Player);
        player.receiveCard(card2Player);
        System.out.println("Player hand " + player.getPlayerHand());

        String card1Dealer = deck.getCard();
        String card2Dealer = deck.getCard();
        Dealer dealer = new Dealer();
        dealer.receiveCard(card1Dealer);
        dealer.receiveCard(card2Dealer);
        System.out.println("Dealer hand " + dealer.getPlayerHand());




        System.out.println(deck.getCardValue(card1Player));
        System.out.println(deck.getCardValue(card2Player));
        System.out.println(deck.getCardValue(card1Dealer));
        System.out.println(deck.getCardValue(card2Dealer));
    }
}