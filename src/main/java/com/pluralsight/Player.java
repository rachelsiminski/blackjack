package com.pluralsight;

public class Player {
    private final Hand hand;
    private final int score;
    private boolean isWinner;

    public Player() {
        this.hand = new Hand();
        this.isWinner = false;
        this.score = 0;
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
