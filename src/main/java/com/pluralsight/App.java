package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deck deck = new Deck();
        System.out.println(deck.getSize());

        deck.shuffle();

        System.out.println("Enter the number of players: ");
        int numberOfPlayers = Integer.parseInt(scanner.nextLine());

        Game game = new Game();

        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Enter name of player: ");
            String name = scanner.nextLine();
            Player player = new Player(name, i);
            game.addPlayer(player);
            player.getHand().deal(deck.deal());
            player.getHand().deal(deck.deal());

            displayHand(player);
        }

    }

    private static void displayHand(Player player) {
        System.out.printf("Player name: %s%nHand Size: %d%nScore: %d%nWinner: %b%n", player.getName(), player.getHand().getSize(), player.getScore(), player.getIsWinner());
    }
}
