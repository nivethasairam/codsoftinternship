package task1;

import java.util.Scanner;
import java.util.Random;//package to generate any numbers between 1 to 100

public class task1{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Random automaticnumbers = new Random();
        int maxAttempts = 7; // Set the maximum number of attempts per round
        int startnum = 1;
        int endnum = 100;
        int level = 0;
        int totalAttempts=0;
        int totalScore = 0; // Initialize total score

        while (true) {
            level++;//to increment each level as user play each time
            int guessit = automaticnumbers.nextInt( (100 -1 ) + 1) + 1;// bound value will be 100 but 0 to 99 range so by adding  +1 if random value 0 means it will become 1 if random value 99 means it becomes 100
            Scanner n =new Scanner(System.in);
            System.out.print("ENTER YOUR NAME:");
            String name=n.nextLine();
            
            
            System.out.println("HOLA!! " + name + " \n" );
            System.out.println("\tWELCOME TO LEVEL" + level);
            System.out.print("\n");
            System.out.println("GUESS THE NUMBER BETWEEN " + startnum + " AND " + endnum + ". YOU HAVE  " + maxAttempts + " ATTEMPTS.");
            System.out.println("LETS START");
            int attempts = gamepoint(obj, guessit, maxAttempts);//gamepoint method is called to play the game and returns the number of attempts taken.
            totalAttempts += attempts;
            totalScore += scoreevaluation(attempts, maxAttempts); // Update total score based on attempts

            System.out.print("ISN'T IT  FUNNY AND AMAZING WOULD YOU LIKE  TO PLAY ANOTHER LEVEL? (YES/NO): ");
            String playAgain = obj.nextLine().trim().toLowerCase();
            if (!playAgain.equalsIgnoreCase("yes")) {//if user willing to play the levels will be continued otherwise game ends
                break;
            }
        }

        System.out.println("GAME OVER! YOU PLAYED " + level + " LEVEL TOTALLY");//game ends and prints message to user
        System.out.println("YOUR TOTAL SCORE : " + totalScore); // Display total score
        System.out.println("THANK YOU SEE YOU AGAIN");
        
        obj.close();
    }

    public static int gamepoint(Scanner obj, int numberToGuess, int maxAttempts) {
        int attempts = 0;
        while (attempts < maxAttempts) {
            int userGuess = promptUserGuess(obj);
            attempts++;
            System.out.println("YOUR ATTEMPT "+attempts);
            if (userGuess == numberToGuess) {
            	System.out.println("HURRAH!!");
                System.out.println("CORRECT YOU GUESSED THE NUMBER IN" + attempts + " ATTEMPTS.");
                System.out.println("CONGRATULATIONS YOU WON THE GAME ");
                return attempts;
            } else if (userGuess < numberToGuess) {
            	System.out.println("NOT BAD ");
                System.out.println("TOO LOW !");
                System.out.println("\n");
            } else {
            	System.out.println("YOU ARE NEAR BUT ");
                System.out.println("TOO HIGH !");
                System.out.println("\n");
                
            }
        }
        System.out.println("YOU TRIED YOUR BEST ");
        System.out.println("YOU'VE USED ALL YOUR  " + maxAttempts + " ATTEMPTS.THE CORRECT NUMBER IS  " + numberToGuess + ".");
        return attempts + 1; // Return maxAttempts + 1 to indicate failure to guess within allowed attempts
    }

    public static int promptUserGuess(Scanner obj) {
        while (true) {
        	//System.out.println("LET'S START");
            System.out.print("ENTER YOUR GUESS: ");
            try {
                return Integer.parseInt(obj.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("OOPS IT IS  INVALID");
                System.out.println("ENTER ONLY NUMBERS BETWEEN 1 TO 100 ");
            }
        }
    }

    // Calculate score based on the number of attempts
    public static int scoreevaluation(int attempts, int maxAttempts) {
        int maxScore = 70; // Maximum score for guessing on the first attempt
        int pointsPerAttempt = 10; // Points deducted per additional attempt
        if (attempts <= maxAttempts) {
            return maxScore - (attempts - 1) * pointsPerAttempt;//if user takes 6 attempts then score calculated  70-(6-1)*10 = 70-5*10=20 points
        }
        return 0;
    }
}


