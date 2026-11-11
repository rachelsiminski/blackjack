package com.pluralsight;

public class App {
    public static void main(String[] args) {
        Deck deck = new Deck();

        Hand hand1 = new Hand();

        for (int i = 0; i < 5; i++) {
            Card card = deck.deal();
            hand1.deal(card);
        }

        System.out.println("This hand is worth: " + hand1.getValue());
    }
}
