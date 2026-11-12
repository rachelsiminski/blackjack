package com.pluralsight;

public class Game {
    private final Player player1;
    private final Player player2;
    private boolean winState;

    public Game() {
        player1 = new Player();
        player2 = new Player();
        winState = false;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public boolean isWinState() {
        return winState;
    }

    public void setWinState() {
        if (player1.getScore() == 21) {
            winState = true;
        } else if (player2.getScore() == 21) {
            winState = false;
        } else if (player1.getScore() > player2.getScore() && player1.getScore() < 21) {
            winState = true;
        } else if (player2.getScore() > player1.getScore() && player2.getScore() < 21) {
            winState = false;
        }
    }
}
