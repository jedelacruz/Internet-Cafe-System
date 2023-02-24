package liliana;

import java.util.Random;
import java.util.Scanner;

public class cafe {
	
	Scanner s = new Scanner(System.in);
	Random rand = new Random();
	
	public void title() {
		System.out.println("Internet Cafe System");
		System.out.println();
		System.out.println("Type the number of your choice");
		loginChoice();
	}
	
	public void loginChoice(){
		int choice;
		
		System.out.println("");
		System.out.println("(1) Login as user");
		System.out.println("(2) Login as admin ");
		System.out.println();
		
		choice = s.nextInt();
		
		switch(choice){
		case 1:
			System.out.println();
			userLogin();
			break;
		case 2:
			adminLoginPin();
			break;
		default:
			System.out.println();
			System.out.println("Invalid Number");
			loginChoice();
			break;
		}
	}
	
	public void userLogin() {
		String username;
		String password;
		
		System.out.print("---------- LOGIN AS USER ----------");
		System.out.println();
		System.out.println();
		
		System.out.print("Username: ");
		s.nextLine();
		username = s.nextLine();
		
		System.out.print("Password: ");
		password = s.nextLine();
		
		if (username.equals("user") && password.equals("12345")){
			System.out.println();
			System.out.println("Succesfully Login");
			System.out.println();
			userPanel();
		}
		else if (username.equals("user") && !password.equals("12345")){
			System.out.println();
			System.out.println("Wrong password");
			userLoginFix();
		}
		else if (!username.equals("user") && password.equals("12345")){
			System.out.println();
			System.out.println("Wrong username");
			userLoginFix();
		}
		else {
			System.out.println();
			System.out.println("Wrong username and password");
			userLoginFix();
		}
	}
	public void userLoginFix() {
		String username;
		String password;
		
		System.out.println();
		System.out.print("Username: ");
		username = s.nextLine();
		
		System.out.print("Password: ");
		password = s.nextLine();
		
		if (username.equals("user") && password.equals("12345")){
			System.out.println();
			System.out.println("Succesfully Login");
			System.out.println();
			userPanel();
		}
		else if (username.equals("user") && !password.equals("12345")){
			System.out.println();
			System.out.println("Wrong password");
			userLoginFix();
		}
		else if (!username.equals("user") && password.equals("12345")){
			System.out.println();
			System.out.println("Wrong username");
			userLoginFix();
		}
		else {
			System.out.println();
			System.out.println("Wrong username and password");
			userLoginFix();
		}
	}
	public void adminLoginPin() {
		int pin=555;
		
		System.out.println();
		System.out.print("Enter the pin to enter: ");
		pin = s.nextInt();
		
		if(pin == 555) {
			System.out.println("The pin is correct");
			adminLogin();
		}
		else {
			System.out.println("The pin is incorrect, please try again");
			adminLoginPin();
		}
		
	}
	public void adminLogin() {
		String username;
		String password;
		
		System.out.println();
		System.out.print("---------- LOGIN AS ADMIN ----------");
		System.out.println();
		System.out.println();
		
		System.out.print("Username: ");
		s.nextLine();
		username = s.nextLine();
		
		System.out.print("Password: ");
		password = s.nextLine();
		
		if (username.equals("admin") && password.equals("54321")){
			System.out.println();
			System.out.println("Succesfully Login");
			adminPanel();
		}
		else if (username.equals("admin") && !password.equals("54321")){
			System.out.println();
			System.out.println("Wrong password");
			adminLoginFix();
		}
		else if (!username.equals("admin") && password.equals("54321")){
			System.out.println();
			System.out.println("Wrong username");
			adminLoginFix();
		}
		else {
			System.out.println();
			System.out.println("Wrong username and password");
			adminLoginFix();
		}
	}
	public void adminLoginFix() {
		String username;
		String password;
		
		System.out.println();
		System.out.print("Username: ");
		username = s.nextLine();
		
		System.out.print("Password: ");
		password = s.nextLine();
		
		if (username.equals("admin") && password.equals("54321")){
			System.out.println();
			System.out.println("Succesfully Login");
			adminPanel();
		}
		else if (username.equals("admin") && !password.equals("54321")){
			System.out.println();
			System.out.println("Wrong password");
			adminLoginFix();
		}
		else if (!username.equals("admin") && password.equals("54321")){
			System.out.println();
			System.out.println("Wrong username");
			adminLoginFix();
		}
		else {
			System.out.println();
			System.out.println("Wrong username and password");
			adminLoginFix();
		}
	}
	public void	userPanel() {
		int userPanelChoice;
		System.out.println();
		System.out.println("---------- USER PANEL ----------");
		System.out.println();
		System.out.println("(1) Play a game");
		System.out.println("(2) Check minutes");
		System.out.println("(3) Log out");
		
		System.out.println();
		userPanelChoice = s.nextInt();
	
		
		switch(userPanelChoice) {
		
		case 1:
			System.out.println();
			gamePanel();
			break;
		case 2:
			System.out.println();
			System.out.println("Check minutes");
			System.out.println();
			int min = 0;  
			int max = 60;  
			int b = (int)(Math.random()*(max-min+1)+min);  
			System.out.println("You have "+b+" minutes left" );  
			userPanel();
			break;
		case 3:
			System.out.println("Succesfuly logout");
			System.out.println();
			title();
			break;
		default:
			System.out.print("Invalid number, please try again");
			userPanel();
			break;
		}
	}
	public void gamePanel() {
		int gamePanelChoice;
		System.out.println();
		System.out.println("(1) Rock Paper Scissors");
		System.out.println("(2) Black Jack");
		System.out.println("(3) Back");
		
		System.out.println();
		gamePanelChoice =s.nextInt();

		System.out.println();
		
		switch( gamePanelChoice) {
		case 1:		
			rpsPanel();
			break;
		case 2:
			blackJackPanel();
			break;
		case 3:
			userPanel();
			break;
		default:
			System.out.print("Invalid Choice, please choose again");
		}	
	}
	
	public void rpsPanel() {
		 String[] options = {"rock", "paper", "scissors"};
		 System.out.println("---------- ROCK PAPER SCISSORS ----------");
		 System.out.println();
		 
		    while (true) {
		      // Get the user's choice
		      System.out.println("Enter your choice (rock, paper, scissors):");
		  
		      String userChoice = s.nextLine();

		      // Make sure the user entered a valid choice
		      if (!userChoice.equalsIgnoreCase("rock") && !userChoice.equalsIgnoreCase("paper") && !userChoice.equalsIgnoreCase("scissors")) {
		        System.out.println("Invalid choice. Please try again.");
		        continue;
		      }

		      // Generate a random choice for the computer
		      String computerChoice = options[rand.nextInt(options.length)];

		      System.out.println("You chose " + userChoice + " and the computer chose " + computerChoice + ".");

		      // Determine the winner
		      if (userChoice.equalsIgnoreCase(computerChoice)) {
		        System.out.println("It's a tie!");
		      } 
		      else if ( (userChoice.equalsIgnoreCase("rock") && computerChoice.equalsIgnoreCase("scissors")) || 
		                  (userChoice.equalsIgnoreCase("scissors") && computerChoice.equalsIgnoreCase("paper")) || 
		                  (userChoice.equalsIgnoreCase("paper") && computerChoice.equalsIgnoreCase("rock")) ) {
		        System.out.println("You win!");
		      } 
		      else {
		        System.out.println("The computer wins!");
		      }
		      System.out.println();
		      System.out.println("Do you want to play again? (y/n)");
		      String playAgain = s.nextLine();
		      
		      if (playAgain.equalsIgnoreCase("y")) {
		    	System.out.println();
		        rpsPanelFix();
		      }
		      else if (playAgain.equalsIgnoreCase("n")){
		    	  userPanel();
		    	  break;
		    	 
		      }
		    }
		    //s.close();
	}
	
	public void rpsPanelFix() {
		String[] options = {"rock", "paper", "scissors"};
		 System.out.println("---------- ROCK PAPER SCISSORS ----------");
		 System.out.println();

		    while (true) {
		      // Get the user's choice
		      System.out.println("Enter your choice (rock, paper, scissors):");
		      String userChoice = s.nextLine();

		      // Make sure the user entered a valid choice
		      if (!userChoice.equalsIgnoreCase("rock") && !userChoice.equalsIgnoreCase("paper") && !userChoice.equalsIgnoreCase("scissors")) {
		        System.out.println("Invalid choice. Please try again.");
		        continue;
		      }

		      // Generate a random choice for the computer
		      String computerChoice = options[rand.nextInt(options.length)];

		      System.out.println("You chose " + userChoice + " and the computer chose " + computerChoice + ".");

		      // Determine the winner
		      if (userChoice.equalsIgnoreCase(computerChoice)) {
		        System.out.println("It's a tie!");
		      } 
		      else if ( (userChoice.equalsIgnoreCase("rock") && computerChoice.equalsIgnoreCase("scissors")) || 
		                  (userChoice.equalsIgnoreCase("scissors") && computerChoice.equalsIgnoreCase("paper")) || 
		                  (userChoice.equalsIgnoreCase("paper") && computerChoice.equalsIgnoreCase("rock")) ) {
		        System.out.println("You win!");
		      } 
		      else {
		        System.out.println("The computer wins!");
		      }
		      System.out.println();
		      System.out.println("Do you want to play again? (y/n)");
		      String playAgain = s.nextLine();
		      
		      if (playAgain.equalsIgnoreCase("y")) {
			    	System.out.println();
			        rpsPanelFix();
			      }
			  else if (playAgain.equalsIgnoreCase("n")){
			    	  userPanel();
			    	  break;
			      }
		    }
	}
	public void blackJackPanel() {
		
		System.out.println("---------- BLACK JACK ----------");
		System.out.println();
		 // Generate a random number between 1 and 11 for the dealer's first card
        int dealerCard1 = rand.nextInt(11) + 1;
        // Generate a random number between 1 and 11 for the dealer's second card
        int dealerCard2 = rand.nextInt(11) + 1;
        // Calculate the dealer's total hand value
        int dealerTotal = dealerCard1 + dealerCard2;
        System.out.println("Dealer's hand: " + dealerCard1 + " + " + dealerCard2 + " = " + dealerTotal);

        // Generate a random number between 1 and 11 for the player's first card
        int playerCard1 = rand.nextInt(11) + 1;
        // Generate a random number between 1 and 11 for the player's second card
        int playerCard2 = rand.nextInt(11) + 1;
        // Calculate the player's total hand value
        int playerTotal = playerCard1 + playerCard2;
        System.out.println("Your hand: " + playerCard1 + " + " + playerCard2 + " = " + playerTotal);

        // The player can choose to hit or stand
        boolean playerTurn = true;
        while (playerTurn) {
            System.out.println("Would you like to hit or stand? (Enter H or S)");
            String playerAction = s.nextLine();
            if (playerAction.equalsIgnoreCase("H")) {
                // Generate a random number between 1 and 11 for the player's next card
                int playerCard = rand.nextInt(11) + 1;
                playerTotal += playerCard;
                System.out.println("You drew a " + playerCard + ". Your new total is " + playerTotal);
                if (playerTotal > 21) {
                    System.out.println("You bust! You lose.");
                    playerTurn = false;
                    gamePanel();
                    
                }
            } 
            else if (playerAction.equalsIgnoreCase("S")) {
                playerTurn = false;
            }
        }

        // If the player didn't bust, the dealer's turn starts
        if (playerTotal <= 21) {
            System.out.println("Dealer's turn:");
            while (dealerTotal < 17) {
                // Generate a random number between 1 and 11 for the dealer's next card
                int dealerCard = rand.nextInt(11) + 1;
                dealerTotal += dealerCard;
                System.out.println("Dealer drew a " + dealerCard + ". Dealer's new total is " + dealerTotal);
                if (dealerTotal > 21) {
                    System.out.println("Dealer busts! You win!");
                    gamePanel();
                   
            		}
                }
            }

            if (dealerTotal <= 21) {
                if (dealerTotal > playerTotal) {
                    System.out.println("Dealer wins!");
                    gamePanel();
                } 
                else if (dealerTotal == playerTotal) {
                	 System.out.println("Tie!");
                	 gamePanel();
                	 
                }
               
            }
        }
	
public void adminPanel() {
	int adminPanelChoice;
	
	System.out.println();
	System.out.println("---------- ADMIN PANEL ----------");
	System.out.println();
	System.out.println("(1) Check Computer");
	System.out.println("(2) Logout");
	System.out.println();
	adminPanelChoice = s.nextInt();
	System.out.println();
	
	switch(adminPanelChoice) {
	case 1:
		System.out.println("Checking Computer...");
		System.out.println("Done Checking...");
		System.out.println("No errors found...");
		adminPanel();
		break;
	case 2:
		title();
		break;
	default:
		System.out.println("Invalid number, please choose again");
		System.out.println();
		adminPanel();
		break;
	}
	
}



}

		
	


