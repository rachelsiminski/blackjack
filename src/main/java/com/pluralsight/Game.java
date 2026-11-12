//package com.pluralsight;
//
//public class Game {
//    private final Player dealer;
//    private final Player player2;
//    private boolean dealerWin;
//
//    public Game() {
//        dealer = new Player();
//        player2 = new Player();
//        dealerWin = false;
//    }
//
//    public Player getDealer() {
//        return dealer;
//    }
//
//    public Player getPlayer2() {
//        return player2;
//    }
//
//    public boolean isDealerWin() {
//        return dealerWin;
//    }
//
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
//}
