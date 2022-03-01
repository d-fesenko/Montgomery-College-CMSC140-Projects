/*
 * Class: CMSC203 
 * Instructor: Dr. Grinberg
 * Description: Random Number Guesser Program
 * Due: 2/28/2021
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Daniel Fesenko
*/
import java.util.*;
public class NumberGuesser {
	public static void main(String[] args) {
	//Declaring variables for the program
	Scanner stdin = new Scanner(System.in);
	int userInput;
	int guess;
	int lowGuess = 0;
	int highGuess = 100;
	int randNum = RNG.rand();
	String yesOrNo = "";
	
	
	//Loop repeats forever, breaking out only when the user guesses a correct number.
	int x = 1;
	while (x == 1) {
	
	System.out.println("Guess a number between 0 and 100!");
	
	//Sets guess to next user input, and validates the input.
	guess = stdin.nextInt();
	while (RNG.inputValidation(guess,lowGuess,highGuess) == false)
	{
		System.out.println("Guess a number between 0 and 100!");
		guess = stdin.nextInt();
	}

	//If guess is correct, count is reset and user is asked if they want to play again.
	if (guess == randNum)
	{
		System.out.println("Number of guesses is " + RNG.getCount() + "\nCongratulations, you guessed correctly!");
		
		//If user inputs yes, the counter resets, new number is found, and the loop continues. 
		//If user inputs no, the loop breaks and the program ends.
		while (true) {
		System.out.println("Want to play again? (yes or no)");
		
		yesOrNo = stdin.next();
		
		if (yesOrNo.equalsIgnoreCase("yes"))
		{
			RNG.resetCount();
			randNum = RNG.rand();
			lowGuess = 0;
			highGuess = 100;
			break;
		}
		else if (yesOrNo.equalsIgnoreCase("no"))
		{
			//Sets the variable controling the while loop to zero, exiting the loop.
			x = 0;
			break;
		}
		else
		{
			System.out.println("Invalid input!");
		}
		}
	}
	else  if (guess > randNum)
	{
		highGuess = guess;
		System.out.println("Number of guesses is " + RNG.getCount() + "\nGuess is too high, try again!");
	}
	else
	{
		lowGuess = guess;
		System.out.println("Number of guesses is " + RNG.getCount() + "\nGuess is too low, try again!");
	}
	}
	System.out.println("Thanks for playing!\nProgrammed by Daniel Fesenko");
	}
	
}
