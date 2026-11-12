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

        ArrayList<String> players = new ArrayList<>();

        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Enter name of player: ");
            String name = scanner.nextLine();
            players.add(name);
            Hand hand = new Hand(name);
            hand.deal(deck.deal());
            hand.deal(deck.deal());
            System.out.println(hand.getName() + " " + hand.getSize());
        }


    }
}
