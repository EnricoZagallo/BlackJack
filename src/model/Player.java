package model;

import java.util.ArrayList;
import java.util.List;

public class Player {
    List<String> playerHand = new ArrayList<>(2);

    public void receiveCard(String card){
        playerHand.add(card);
    }
    public List<String> getPlayerHand() {
        return playerHand;

    }
}
