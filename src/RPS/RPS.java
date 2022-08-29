package RPS;

import java.util.Random;
import java.util.Scanner;


public class RPS {
	
	public static final int MAXROUNDS = 10;
	public static final int MINROUNDS = 1;
	public static final Random RND = new Random();
	public static final int RNDINTMAX = 3;
	public static final int OFFSET = 1;
	public static final int ROCK = 1;
	public static final int PAPER = 2;
	public static final int SCISSORS = 3;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int rounds = 0, wins = 0,losses = 0,draws = 0, playerChoice = 0, computerChoice= 0;
		boolean keepPlaying = true, choosingEnd = true;
		while (keepPlaying) {
			rounds = 0;
			while (rounds < MINROUNDS || rounds > MAXROUNDS) {
				System.out.print("Input a number of round between" + MINROUNDS + " and " + MAXROUNDS + ":");
				try {
						rounds = Integer.parseInt(in.nextLine());
					}
					catch(Exception e) {
						rounds = 0;
					}
			}
			switch(rounds) {
			  case 1:
				  System.out.println("You will play " + rounds + " round");
			    break;
			  default:
				  System.out.println("You will play " + rounds + " rounds");
			}
			
			for (int i = 1; i <= rounds; i++) {
				System.out.println("============================================" + "Round " + i + "============================================");
				while (playerChoice < ROCK || playerChoice > SCISSORS) {
					System.out.print("Input a number between 1 and 3 (1 = Rock, 2 = Paper, 3 = Scissors):");
					try {
							playerChoice = Integer.parseInt(in.nextLine());
						}
						catch(Exception e) {
							playerChoice = 0;
						}
				}
				switch(playerChoice) {
				  case 1:
					  System.out.println("Player has chosen: Rock");
				    break;
				  case 2:
					  System.out.println("Player has chosen: Paper");
				    break;
				  case 3:
					  System.out.println("Player has chosen: Scissors");
				    break;
				  default:
					  System.out.println("How did we get here?");
				}
				
				computerChoice = RND.nextInt(RNDINTMAX) + OFFSET;
				
				switch(computerChoice) {
				  case 1:
					  System.out.println("Computer has chosen: Rock");
				    break;
				  case 2:
					  System.out.println("Computer has chosen: Paper");
				    break;
				  case 3:
					  System.out.println("Computer has chosen: Scissors");
				    break;
				  default:
					  System.out.println("How did we get here?");
				}
				
				if (playerChoice == computerChoice) {
					draws += 1;
					System.out.println("Round " + i + " is a draw!");
				} else if (playerChoice == ROCK) {
					if (computerChoice == PAPER) {
						losses += 1;
						System.out.println("Computer wins round " + i);
					} else {
						wins += 1;
						System.out.println("Player wins round " + i);
					}
				} else if (playerChoice == PAPER) {
					if (computerChoice == SCISSORS) {
						losses += 1;
						System.out.println("Computer wins round " + i);
					} else {
						wins += 1;
						System.out.println("Player wins round " + i);
					}
				} else {
					if (computerChoice == ROCK) {
						losses += 1;
						System.out.println("Computer wins round " + i);
					} else {
						wins += 1;
						System.out.println("Player wins round " + i);
					}
				}
				playerChoice = 0;
			}
			System.out.println("============================================Conclusion============================================");
			System.out.println("Total Player Wins: " + wins);
			System.out.println("Total Computer Wins: " + losses);
			System.out.println("Total Draws: " + draws);
			if (wins == losses) {
				System.out.println("Game is a DRAW!");
			} else if (wins > losses) {
				System.out.println("Player WINS!");
			} else {
				System.out.println("Computer WINS!");
			}
			wins = 0;
			losses = 0;
			draws = 0;
			playerChoice = 0;
			computerChoice= 0;
			choosingEnd = true;
			while (choosingEnd) {
				System.out.print("Would you like to play again? yes/no:");
				String choice = in.nextLine();
				switch(choice) {
				  case "y": case "yes": case "Yes": case "0":
 					  keepPlaying = true;
					  choosingEnd = false;
				    break;
				  case "n": case "no": case "No": case "1":
					  keepPlaying = false;
					  choosingEnd = false;
				    break;
				  default:
					  choosingEnd = true;
				}
			}
		}
		System.out.println("Thanks for playing!");
		in.close();
	}
}
