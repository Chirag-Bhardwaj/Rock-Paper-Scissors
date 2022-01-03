///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           Rock Paper Scissors game
//
// Author:          Chirag Bhardwaj
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void game() {
        Random rand = new Random();
        String R;
        String P;
        String S;
        System.out.print("Please select one of [R/P/S]: ");
        Scanner scnr = new Scanner(System.in);
        String inp = scnr.next();
        int randChoice = rand.nextInt(3) + 1;
        String choice;
        if (randChoice == 1) {
            choice = "Rock";
        } else if (randChoice == 2) {
            choice = "Paper";
        } else {
            choice = "Scissors";
        }

        if (inp.equalsIgnoreCase("R")) {
            System.out.println("You chose: Rock");
            System.out.println("I chose: " + choice);
            if (choice.equalsIgnoreCase("Rock")) {
                System.out.println("A Tie!");
            } else if (choice.equalsIgnoreCase("Paper")) {
                System.out.println("Paper beats rock - you lose!");
            } else if (choice.equalsIgnoreCase("Scissors")) {
                System.out.println("Rock beats scissors - you win!");
            }
        } else if (inp.equalsIgnoreCase("P")) {
            System.out.println("You chose: Paper");
            System.out.println("I chose: " + choice);
            if (choice.equalsIgnoreCase("Rock")) {
                System.out.println("Paper beats rock - you win!");
            } else if (choice.equalsIgnoreCase("Paper")) {
                System.out.println("A Tie!");
            } else if (choice.equalsIgnoreCase("Scissors")) {
                System.out.println("Scissors beats paper - you lose!");
            }
        } else if (inp.equalsIgnoreCase("S")) {
            System.out.println("You chose: Scissors");
            System.out.println("I chose: " + choice);
            if (choice.equalsIgnoreCase("Rock")) {
                System.out.println("Rock beats scissors - you lose!");
            } else if (choice.equalsIgnoreCase("Paper")) {
                System.out.println("Scissors beats paper - you win!");
            } else if (choice.equalsIgnoreCase("Scissors")) {
                System.out.println("A Tie!");
            }
        } else if (choice.equalsIgnoreCase("i")){
            rerun(choice);
        } else {
            System.out.println("Invalid choice! Defaulting to Rock.");
            System.out.println("I chose: " + choice);
            if (choice.equalsIgnoreCase("Rock")) {
                System.out.println("A Tie!");
            } else if (choice.equalsIgnoreCase("Paper")) {
                System.out.println("Paper beats rock - you lose!");
            } else if (choice.equalsIgnoreCase("Scissors")) {
                System.out.println("Rock beats scissors - you win!");
            }
        }
    }
    public static void rerun(String input){
        game();
    }

    public static void main(String[] args) {
        game();
    }

}


