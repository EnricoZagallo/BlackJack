/* package model;

public class Card {
    String suit;
    String value;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    public int getValue() {
        return switch (value) {
            case "A" -> 11;
            case "K", "Q", "J" -> 10;
            default -> Integer.parseInt(value);
        };
    }

    @Override
    public String toString() {
        return value + " of " + suit;
    }
}

 */
