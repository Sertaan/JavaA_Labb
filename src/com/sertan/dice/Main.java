package com.sertan.dice;

import java.util.Random;
import java.util.Scanner;

public class Main extends Colors {
    public static void main(String[] args) {

        // Instantiate
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Variables
        String player1;
        String player2;
        int player1sum = 0;
        int player2sum = 0;

        // Player1 name
        System.out.println("Input player1's name!");
        player1 = sc.nextLine();
        System.out.println("Player1's name is: " + player1);

        // Player2 name
        System.out.println("Input player2's name");
        player2 = sc.nextLine();
        System.out.println("player2's name is: " + player2);


        // Loop för att simulera kast för båda spelarna
        for (int i = 0; i < 1; i++) {
            int die1 = random.nextInt(6) + 1; // Slå tärning för spelare 1
            int die2 = random.nextInt(6) + 1; // Slå tärning för spelare 2

            // Uppdatera summerande poöng för varje spelare
            player1sum += die1;
            player2sum += die2;

            // Skriv ut resultatet av varje tärningskast
            System.out.println(player1 + " rolled: " + die1);
            System.out.println(player2 + " rolled: " + die2);
        }
        // Bestäm vinnaren baserat på summerande poäng
        String winner;
        if (player1sum > player2sum) {
            winner = player1;
        } else if (player2sum > player1sum) {
            winner = player2;
        } else {
            winner = "It's a tie!";
        }

        // skriv ut vinnare
        System.out.println(BLUE + "The winner is: " + winner);
        System.out.println(GREEN + "===Congratulation===");
        System.out.println(GREEN + "===Congratulation===");
        System.out.println(GREEN + "===Congratulation===");
    }

}
