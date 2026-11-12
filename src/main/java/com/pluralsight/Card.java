package com.pluralsight;

public class Card {
    private final String suit;
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
            return null;
        }
    }

    public String getValue() {
        if (isFaceUp) {
            return value;
        } else {
            return null;
        }
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public int getPointValue() {
        if (isFaceUp) {
            switch (value) {
                case "A" -> value = "11";
                case "K", "Q", "J" -> value = "10";
                default -> value = value;
            }
            return parseValue(value);
        } else {
            return 0;
        }
    }

    private static int parseValue(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            System.out.println("Unable to parse point value");
            return 0;
        }
    }

    public void flip() {
        isFaceUp = !isFaceUp;
    }
}
