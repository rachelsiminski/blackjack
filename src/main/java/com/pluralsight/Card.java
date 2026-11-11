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
                case "a" -> value = "11";
                case "k", "q", "j" -> value = "10";
                default -> System.out.println("Invalid card value");
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
