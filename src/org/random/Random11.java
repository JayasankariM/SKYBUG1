package org.random;



	import java.util.Random;



	import java.util.Scanner;

	public class Random11  {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        
	        int lowerBound = 1;
	        int upperBound = 100;
	        int maxAttempts = 5;
	        int totalAttempts = 0;
	        int totalRounds = 0;
	        int totalScore = 0;
	        boolean playAgain = true;
	        
	        System.out.println("Welcome to the Number Guessing Game!");
	        
	        while (playAgain) {
	            int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
	            int attempts = 0;
	            boolean guessedCorrectly = false;
	            
	            System.out.println("I have chosen a number between " + lowerBound + " and " + upperBound + ". You have " + maxAttempts + " attempts.");
	            
	            while (!guessedCorrectly && attempts < maxAttempts) {
	                System.out.print("Enter your guess: ");
	                int guess = scanner.nextInt();
	                attempts++;
	                totalAttempts++;
	                
	                if (guess < randomNumber) {
	                    System.out.println("Too low! Try again.");
	                } else if (guess > randomNumber) {
	                    System.out.println("Too high! Try again.");
	                } else {
	                    guessedCorrectly = true;
	                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
	                    totalScore += maxAttempts - attempts + 1;
	                }
	            }
	            
	            if (!guessedCorrectly) {
	                System.out.println("Sorry, you've run out of attempts. The correct number was: " + randomNumber);
	            }
	            
	            totalRounds++;
	            
	            System.out.print("Do you want to play again? (yes/no): ");
	            String playAgainResponse = scanner.next();
	            playAgain = playAgainResponse.equalsIgnoreCase("yes");
	        }
	        
	        System.out.println("Thank you for playing!");
	        System.out.println("Total rounds played: " + totalRounds);
	        System.out.println("Total attempts made: " + totalAttempts);
	        System.out.println("Total score: " + totalScore);
	        
	        scanner.close();
	    }
	}


