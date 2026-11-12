package com.pluralsight;

public class Card {
    private String suit;
    private String value;
    private boolean isFaceUp;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
        this.isFaceUp = false;
    }

    public String getSuit() {
        if (isFaceUp) {
            return suit;
        } else {
            return "#";
        }
    }

    public String getValue() {
        if (isFaceUp) {
            return value;
        } else {
            return "#";
        }
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public int getPointValue() {
        if (isFaceUp) {
            return switch (value) {
                case "A" -> 11;
                case "K", "Q", "J" -> 10;
                default -> Integer.parseInt(value);
            };
        } else {
            return 0;
        }
    }

    public void flip() {
        isFaceUp = !isFaceUp;
    }
}
