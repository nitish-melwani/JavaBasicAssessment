import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import javax.naming.directory.InvalidAttributesException;

import com.wileyedge.exceptions.NumberOutOfBoundException;

public class RockPaperScissors {
	public static boolean playing = true;
	public static int numrounds = 0;
	public static boolean playGame() throws NumberOutOfBoundException {
		Scanner sc = new Scanner(System.in);
		int uwins = 0; // number of times the user wins
		int cwins = 0; // number of times the computer wins
		int ties = 0; // number of ties
		int choice; // the users choice of Rock, Paper or Scissors
		int play; // the number of rounds the user would like to play again after completing the game
		System.out.println("Please input '1' for Rock, '2' for Paper and '3' for Scissors");
		for (int i = 0; i < numrounds; i++) {
			System.out.println("Rock, Paper, or Scissors");
			choice= Integer.parseInt(sc.next());
			int randomnum = ThreadLocalRandom.current().nextInt(1, 3 + 1); // generating a random number between 1 and 3 to represent the computers choice
			if (choice == 1) {
				System.out.println("You picked Rock");
				if (randomnum == 1) {// informing the user of their choice, the computers choice and if they won, tied or lost
					System.out.println("I picked Rock");
					System.out.println("Its a tie");
					ties++;//updating the relevant result counter 
					
				} else if (randomnum == 2) {
					System.out.println("I picked Paper");
					System.out.println("I win");
					cwins++;
				} else {
					System.out.println("I picked Scissors");
					System.out.println("You win");
					uwins++;
				}
			} else if (choice == 2) {
				System.out.println("You picked Paper");
				if (randomnum == 1) {
					System.out.println("I picked Rock");
					System.out.println("You win");
					uwins++;
				} else if (randomnum == 2) {
					System.out.println("I picked Paper");
					System.out.println("Its a tie");
					ties++;
					
				} else {
					System.out.println("I picked Scissors");
					System.out.println("I win");
					cwins++;
				}
				
			} else if (choice == 3) {
				System.out.println("You picked Scissors");
				if (randomnum == 1) {
					System.out.println("I picked Rock");
					System.out.println("I win");
					cwins++;
				} else if (randomnum == 2) {
					System.out.println("I picked Paper");
					System.out.println("You win");
					uwins++;
				} else {
					System.out.println("I picked Scissors");
					System.out.println("Its a tie");
					ties++;
					
				}
				
			} else {
				NumberOutOfBoundException nbe = new NumberOutOfBoundException("Please input a number between 1 and 3"); 
				throw nbe; // if the user inputs an invalid number, throw an exception and end program
			}
		}
		//output the points accumulated in this round
		System.out.println("The game has finished. You won " + uwins + " time(s), you tied " + ties + " time(s) and you lost " + cwins + " time(s).");
		System.out.println("Would you like to play again? Input the number of rounds you would like to play (0 for no rounds)");
		play = Integer.parseInt(sc.next()); // the user decides if the would like to play again
		if (play > 10 || play < 0) {
			NumberOutOfBoundException nbe = new NumberOutOfBoundException("Please input a number between 0 and 10");
			throw nbe;
		} else if (play == 0){
			System.out.println("Goodbye");
			return false;
		} else {
			numrounds = play;// updating the number of rounds to be played
			System.out.println(numrounds);
			return true;
		}
	}
	
	public static void main(String[] args) throws NumberOutOfBoundException {
		Scanner sec = new Scanner(System.in);
		System.out.print("How many rounds of Rock Paper Scissors would you like to play? ");
		numrounds = Integer.parseInt(sec.next());
		while(playing) { 
			if (numrounds > 10 || numrounds < 1) {
				NumberOutOfBoundException nbe = new NumberOutOfBoundException("Please input a number between 1 and 10");
				throw nbe;
			} else {
				playing = playGame();
			}
		}
	}
}
