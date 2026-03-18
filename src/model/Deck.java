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
    }

    public void shuffle() {
        Collections.shuffle(valuesList);
    }

    public String getCard() {
        return valuesList.remove(0);
    }

    public int getCardValue(String card) {
        String value = card.split(" ")[0]; // returns for example: ["K", "of", "Hearts"] and the [0] get the first index

        return switch (value) {
            case "A" -> 11;
            case "K", "Q", "J" -> 10;
            default -> Integer.parseInt(value); // transforms the string in integer
        };
    }
}
