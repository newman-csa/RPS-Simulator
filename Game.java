import java.util.Scanner;

public class Game {
    public static void greeting() {
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Rock beats Scissors. Scissors beat paper. Paper beats Rock.");
        System.out.println("The computer has chosen. What's your choice? (rock, paper or scissors)");
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        greeting();
        System.out.print("Your choice: ");
        String choice = scn.next();
        RPS game = new RPS(choice);
        System.out.print("Computer choice: " + game.computerChoice() + "\n");
        game.winner();
    }
}