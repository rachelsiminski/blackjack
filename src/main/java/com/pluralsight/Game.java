package com.pluralsight;

import java.util.ArrayList;

public class Game {
    private ArrayList<Player> players;

    public Game() {
        players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public int getSize() {
        return players.size();
    }

//    public void setWinState(int dealerScore, int playerScore) {
//        if (dealer.getScore() == player2.getScore()) {
//            dealerWin = true;
//        } else if (dealer.getScore() == 21) {
//            dealerWin = true;
//        } else if (player2.getScore() == 21) {
//            dealerWin = false;
//        } else if (dealer.getScore() > player2.getScore() && dealer.getScore() < 21) {
//            dealerWin = true;
//        } else if (player2.getScore() > dealer.getScore() && player2.getScore() < 21) {
//            dealerWin = false;
//        } else if (dealer.getScore() > 21 && player2.getScore() < 21) {
//            dealerWin = false;
//        } else if (dealer.getScore() < 21 && player2.getScore() > 21) {
//            dealerWin = true;
//        }
//    }
}
