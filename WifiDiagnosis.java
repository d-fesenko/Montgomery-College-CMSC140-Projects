/*
 * Class: CMSC203
 * Instructor: Dr. Grinberg
 * Description: Assignment 1 WiFi Diagnosis
 * Due: 2/14/22
 * Platform: Eclipse
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 * Print your name here: Daniel Fesenko
 */
import java.util.Scanner;
public class WifiDiagnosis {
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		String input;
		
		System.out.println("If you have a problem with internet coonnectivity, this WiFi diagnosis might work.");
		System.out.println("First step: reboot your computer. Are you able to connect with the internet? (yes or no)");
		input = stdin.nextLine();
		if (input.equals("yes")) 
		{
			System.out.println("Rebooting the computer seemed to work.");

		}
		else if (input.equals("no"))
		{
			System.out.println("Reboot the router and try to connect. Are you able to connect to the internet? (yes or no)");
			input = stdin.nextLine();
			if (input.equals("yes")) 
			{
				System.out.println("Rebooting the router seemed to work.");

			}
			else if (input.equals("no"))
			{
				System.out.println("Make sure the cables connecting to the router are firmly plugged in and power is getting to the router. Are you able to connect to the internet? (yes or no)");
				input = stdin.nextLine();	
				if (input.equals("yes")) 
				{
					System.out.println("Checking the cables seemed to work.");

				}
				else if (input.equals("no"))
				{
					System.out.println("Move the computer closer to the router and try again. Are you able to connect with the internet? (yes or no)");
					input = stdin.nextLine();
					if (input.equals("yes")) 
					{
						System.out.println("Moving the computer closer seemed to work.");

					}
					else if (input.equals("no"))
					{
						System.out.println("If none of the solutions worked, contact your ISP.");
					}
				}
			}
		}
	}
	

}
