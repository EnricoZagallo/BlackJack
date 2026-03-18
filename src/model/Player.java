package model;

import java.util.ArrayList;
import java.util.List;

public class Player {
    List<String> playerHand = new ArrayList<>();

    public void receiveCard(String card){
        playerHand.add(card);
    }

    public List<String> getPlayerHand() {
        return playerHand;

    }
    public int getHandValue(Deck deck) {
        int total = 0;
        int aces = 0;

        for (String card : playerHand) {
            String value = card.split(" ")[0];

            if (value.equals("A")) {
                aces++;
                total += 11;
            } else {
                total += deck.getCardValue(card);
            }
        }

        // Ajusta os Ases se estourar
        while (total > 21 && aces > 0) {
            total -= 10; // transforma 11 em 1
            aces--;
        }

        return total;
    }
    // no Player.java e Dealer.java
    public void clearHand() {
        playerHand.clear();
    }
}
