package ui;

public class Main
{
	public static void main(String[] args)
	{
		OptionSelection mainMenu = new OptionSelection("Main Menu", false);
		mainMenu.addOption(new SubMenu());
		mainMenu.runSelection();
	}
}