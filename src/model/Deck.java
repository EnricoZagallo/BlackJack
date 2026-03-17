package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
    String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    List<String> valuesList = new ArrayList<>();
    List<String> deckShuflled = new ArrayList<>();

    public void gerarBaralho() {


        for (String suit : suits) {
            for (String value : values) {
                valuesList.add(value + " of " + suit);
            }
        }
        for (String c : valuesList) {
            System.out.println(c);
        }
    }

    public void Shuffle() {
        Collections.shuffle(valuesList);
        for (String c : valuesList) {
            System.out.println(c);
        }
    }

    public String getCard() {
        return valuesList.remove(0);
    }
}
