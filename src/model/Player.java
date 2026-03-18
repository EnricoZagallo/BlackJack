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
    public int getHandValue(Deck deck){
        int total = 0;
        for (String card : playerHand){
            total += deck.getCardValue(card);
        }
        return total;
    }
}
