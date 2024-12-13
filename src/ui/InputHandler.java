package ui;

import java.util.Scanner;

public abstract class InputHandler
{
	static Scanner input = new Scanner(System.in);

	private InputHandler()
	{
	}

	public static String getInput()
	{
		return input.nextLine();
	}
	
	public static int getIntInput() {
		boolean isValid = false;
		int selection = Integer.MIN_VALUE;
		while (isValid == false) {
			String inputLine = getInput();
			try
			{
				selection = Integer.parseInt(inputLine);
				isValid = true;
			}
			catch (NumberFormatException exception) // Gets thrown if the String can't be converted to an int
			{
				System.out.println("Ikke et tal");
			}
		}
		return selection;
	}
}
