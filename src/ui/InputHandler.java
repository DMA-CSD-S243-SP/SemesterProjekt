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
}
