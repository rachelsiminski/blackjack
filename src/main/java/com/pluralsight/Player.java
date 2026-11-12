package com.pluralsight;

import java.util.Locale;

public class Player {
    private String name;
    private Hand hand;
    private int score;
    private int playerNumber;
    private boolean isWinner;


    public Player(String name, int number) {
        this.name = name;
        this.hand = new Hand();
        this.isWinner = false;
        this.score = 0;
        this.playerNumber = number;
    }

    public String getName() {
        return name;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public Hand getHand() {
        return this.hand;
    }

    public int getScore() {
        return hand.getValue();
    }

    public boolean getIsWinner() {
        return this.isWinner;
    }

    public void isWinner(boolean winState) {
        this.isWinner = winState;
    }
}
