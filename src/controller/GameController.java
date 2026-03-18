package controller;

import model.Dealer;
import model.Deck;
import model.Player;
import view.ConsoleView;

import java.util.Scanner;

public class GameController {
    private final Deck deck;
    private final Player player;
    private final Dealer dealer;
    private final ConsoleView view;
    private Scanner scanner;



    public GameController(){
        deck = new Deck();
        player = new Player();
        dealer = new Dealer();
        view = new ConsoleView();
        scanner = new Scanner(System.in);
    }
    public void startGame(){
        deck.gerarBaralho();
        deck.shuffle();

        player.receiveCard(deck.getCard());
        player.receiveCard(deck.getCard());

        dealer.receiveCard(deck.getCard());
        dealer.receiveCard(deck.getCard());

        view.showHand("Player", player.getPlayerHand());
        view.showHand("Dealer", dealer.getPlayerHand());

        gameLoop();

        while (true) {
            System.out.println("\nPlay Again? (y/n)");
            String input = scanner.next().toLowerCase();

            if (input.equals("y")) {
                resetGame();
                gameLoop();
            } else if (input.equals("n")) {
                System.out.println("Thank you for playing!");
                break;
            } else {
                System.out.println("type only 'y' ou 'n'");
            }
        }
    }
    public void resetGame() {
        // Limpa mãos
        player.clearHand();
        dealer.clearHand();

        // Recria e embaralha o deck
        deck.gerarBaralho();
        deck.shuffle();

        // Distribui cartas iniciais
        player.receiveCard(deck.getCard());
        player.receiveCard(deck.getCard());

        dealer.receiveCard(deck.getCard());
        dealer.receiveCard(deck.getCard());

        // Mostra mãos iniciais
        view.showHand("Player", player.getPlayerHand());
        view.showHand("Dealer", dealer.getPlayerHand());
    }
    public void checkGameState(){
        int playerTotal = player.getHandValue(deck);

        if (playerTotal > 21){
            view.showMessage("You lose, your hand is greater than 21");
        }
    }
    public void playerHit(){
        player.receiveCard(deck.getCard());

        view.showHand("player",player.getPlayerHand());

        int total = player.getHandValue(deck);
        view.showMessage("total: "+ total);

        if (total > 21){
            view.showMessage("You lose, your hand is greater than 21");
        }
    }
    public void playerStand() {
        dealerTurn();
        decideWinner();
    }
    public void dealerTurn() {
        while (dealer.getHandValue(deck) < 17) {
            dealer.receiveCard(deck.getCard());
        }

        view.showHand("Dealer", dealer.getPlayerHand());
    }
    public void decideWinner() {
        int playerTotal = player.getHandValue(deck);
        int dealerTotal = dealer.getHandValue(deck);

        view.showMessage("Player: " + playerTotal);
        view.showMessage("Dealer: " + dealerTotal);

        if (dealerTotal > 21) {
            view.showMessage("Dealer bust! You won!");
        } else if (playerTotal > dealerTotal) {
            view.showMessage("Você won!");
        } else if (playerTotal < dealerTotal) {
            view.showMessage("Dealer won!");
        } else {
            view.showMessage("Draw!");
        }
    }
    public void gameLoop() {
        boolean playing = true;

        while (playing) {
            view.showMessage("\nType: (1) Hit ou (2) Stand");

            int choice;

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                view.showMessage("Type only numbers!");
                scanner.nextLine();
                continue;
            }

            if (choice == 1) {
                playerHit();

                int total = player.getHandValue(deck);
                if (total > 21) {
                    view.showMessage("You bust!");
                    playing = false;
                }

            } else if (choice == 2) {
                playerStand();
                playing = false;

            } else {
                view.showMessage("Invalid Option!");
            }
        }
    }
}
