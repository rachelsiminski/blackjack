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

    public int getPointValue(String value) {
        if (isFaceUp) {
            if (value.equalsIgnoreCase("a")) {
                value = "11";
            } else if (value.equalsIgnoreCase("k") || value.equalsIgnoreCase("q") || value.equalsIgnoreCase("j")) {
                value = "10";
            }

            try {
                return Integer.parseInt(value);
            } catch (NumberFormatException e) {
                System.out.println("Unable to parse point value");
                return 0;
            }
        } else {
            return 0;
        }
    }

    public void flip() {
        isFaceUp = !isFaceUp;
    }
}
