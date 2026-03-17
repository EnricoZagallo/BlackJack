package model;

import java.util.List;

public class Dealer extends Player{
    public void receiveCard(String card){
        super.receiveCard(card);
    }

    public List<String> getPlayerHand() {
        return super.getPlayerHand();
    }
}
