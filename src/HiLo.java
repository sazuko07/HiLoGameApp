public class HiLo {
  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);
    java.util.Random rand = new java.util.Random();
    int computerchoice = 0;
    int userguess = 0;
    int userchoice = 0;
    int RemainingGuesses = 5;
    int NewRemainingGuesses = 5;
     
    
    // greet the player
    System.out.println("Hello! Would you like to play HiLo?");
    System.out.println("Type 1 for yes, 2 for no");
    userchoice = keyboard.nextInt();
    
    
    //if user doesnt want to play, program ends
	  if(userchoice == 2) {
	        System.out.println("Oh well, maybe next time!");
	        keyboard.close();
	        System.exit(0);
	  }

	 //if user wants to play, this explains the rules and prompts user for input, and computer chooses random number   
	  if (userchoice == 1) {
	         System.out.println("Great! let's play!");
	         System.out.println("Here are the rules: you have 5 chances to guess which number the computer"
	                + "chose between 1 and 20. The game will tell you if your guess is High or Low. Subsequent"
	                + "games will give you only 3 guesses. Good luck!");
	         System.out.println("User guesses left: 5");
	         System.out.println("User, choose your number: ");
	         userguess = keyboard.nextInt();
	         computerchoice = rand.nextInt(20);
	         
     // game logic and user input
    // big while loop to encapsulate program behavior
	         while(userchoice == 1)   {

	        //when you guess right, the program asks if you want to play again. if not, it terminates	 
	        	 if (userguess == computerchoice) {
	        		 System.out.println("You Guessed Correctly! Computer's choice was: " +computerchoice);
	        		 System.out.println("Would you like to play again?");
	        		 System.out.println("Choose 1 for yes, 2 for no: ");
	        		 userchoice = keyboard.nextInt();
	        		 if(userchoice == 2) {
	        			 System.out.println("Oh well, maybe next time!");
	        			 keyboard.close();
	        			 System.exit(0);
	        		 }
	        		 System.out.println("Please choose your next guess: ");
	        		 userguess = keyboard.nextInt();
	        		 computerchoice = rand.nextInt(20); 
	        		 RemainingGuesses = NewCalcdRemainingGuesses(NewRemainingGuesses);
	        		 
       
    }  
   
	        	 // if your guess is lower than computer's random number, it says your guess is lower, and decrements remaining guesses
	        	 while (userguess < computerchoice) {
    	 
	        		 RemainingGuesses = CalcdRemainingGuesses(RemainingGuesses);
    	
    	
	        		 System.out.println("your guess is too low, try again! Remaining Guesses = " +RemainingGuesses);
	        		 System.out.println("please enter your next guess: ");
	        		 userguess = keyboard.nextInt();
    	
	        	 }
	        	 // if your guess is higher than computer's random number, it says your guess is higher, and decrements remaining guesses
	        	 while (userguess > computerchoice) {
    	
	        		 	RemainingGuesses = CalcdRemainingGuesses(RemainingGuesses);
    	
    	
	        		 	System.out.println("your guess is too High, try again! Remaining Guesses = " +RemainingGuesses);
	        		 	System.out.println("please enter your next guess: ");
	        		 	userguess = keyboard.nextInt();
    

	        	 }
	         }//big while
    
	  } //end big if
    	} //end main
     
  

  	// method to decrement user guesses and tells user that their guesses are up, and terminates program
   			public static int CalcdRemainingGuesses(int RemainingGuesses) {
   				int RG = RemainingGuesses -1;
	
   				if (RemainingGuesses == 1) {
   					System.out.println("Oops! you've run out of guesses! better luck next time!");
   					System.out.println("If you wish to play again, please restart program!");
   					System.out.println("Thank you for playing. See you next time!");
   					System.exit(0);
   				}
   				return RG;
   			}
   				
   	   			public static int NewCalcdRemainingGuesses(int NewRemainingGuesses) {
   	   				int RemainingGuesses = 5;
   	   				int NRG = NewRemainingGuesses -1;
   	   				RemainingGuesses = NewRemainingGuesses; 
   	   				if (RemainingGuesses == 1) {
   	   					System.out.println("Oops! you've run out of guesses! better luck next time!");
   	   					System.out.println("If you wish to play again, please restart program!");
   	   					System.out.println("Thank you for playing. See you next time!");
   	   					System.exit(0);
   	   				}
   	   				return NRG;
   	   				 
	}//end method
   }//end class

