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
        int numberOfDice;

        // Player1 name
        System.out.println(YELLOW + "Input player1's name!");
        player1 = sc.nextLine();
        System.out.println(YELLOW + "Player1's name is: " + player1);

        // Player2 name
        System.out.println(RED + "Input player2's name");
        player2 = sc.nextLine();
        System.out.println(RED + "player2's name is: " + player2 + RESET);

        System.out.println("Input number of dice rolls for each player:");
        numberOfDice = sc.nextInt();


        // Loop för att simulera kast för båda spelarna
        for (int i = 0; i < numberOfDice; i++) {
            int dice1 = random.nextInt(6) + 1; // Slå tärning för spelare 1
            int dice2 = random.nextInt(6) + 1; // Slå tärning för spelare 2

            // Uppdatera summerande poöng för varje spelare
            player1sum += dice1;
            player2sum += dice2;

        }

        System.out.println(GREEN_UNDERLINED + "\nResult:" + RESET);
        System.out.println(YELLOW_BOLD + player1 + " : " + player1sum);
        System.out.println(RED_BOLD + player2 + " : " + player2sum);
        System.out.println("\n");

        // Bestäm vinnaren baserat på summerande poäng
        if (player1sum > player2sum) {
            System.out.println(GREEN_UNDERLINED + "===Congratulation===" + RESET);
            System.out.println(BLUE_BOLD + "The winner is: " + player1 + " with " + (player1sum - player2sum) + (" points diffrence "));
        } else if (player2sum > player1sum) {
            System.out.println(GREEN_UNDERLINED + "===Congratulation===" + RESET);
            System.out.println(BLUE_BOLD + "The winner is: " + player2 + " with " + (player2sum - player1sum) + (" points diffrence "));
        } else {
            System.out.println(BLUE_BOLD + "It's a tie!");
        }


    }

}
