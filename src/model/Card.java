package model;

public class Card {
    String suit;
    String value;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    public int getValue() {
        switch (value) {
            case "A": return 11;
            case "K":
            case "Q":
            case "J": return 10;
            default: return Integer.parseInt(value);
        }
    }

    @Override
    public String toString() {
        return value + " of " + suit;
    }
}
