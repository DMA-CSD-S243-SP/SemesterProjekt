//Packages
package ui;

public class Main
{
	public static void main(String[] args)
	{
		while (true) {
			OptionSelection mainMenu = new OptionSelection("Main Menu", false);
			mainMenu.addOption(new SubMenu());
			mainMenu.runSelection();
		}
		
	}
}