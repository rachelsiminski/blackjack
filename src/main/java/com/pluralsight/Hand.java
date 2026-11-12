package com.pluralsight;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;
    private String name;

    public Hand(String name) {
        cards = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return cards.size();
    }

    public int getValue() {
        int value = 0;

        for (Card card : cards) {
            card.flip();
            value += card.getPointValue();
            card.flip();
        }

        return value;
    }

    public void deal(Card card) {
        cards.add(card);
    }
}
