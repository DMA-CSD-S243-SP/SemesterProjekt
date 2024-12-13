package ui;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that handles menus. Sub menus should be made, by creating a subclass of
 * Option, that sets up it's own OptionSelection in its runOption
 * implementation.
 */
public class OptionSelection
{
	private String selectionName;
	private boolean isCancellable;
	private List<Option> optionList = new ArrayList<>();

	/**
	 * Constructor for OptionSelection, that sets the same of the selection
	 * 
	 * @param selectionName
	 */
	public OptionSelection(String selectionName, boolean isCancellable)
	{
		this.selectionName = selectionName;
		this.isCancellable = isCancellable;
	}

	/**
	 * Method for adding a single option
	 * 
	 * @param option
	 */
	public void addOption(Option option)
	{
		optionList.add(option);
	}

	/**
	 * Method for adding multiple options
	 * 
	 * @param options
	 */
	public void addOption(List<Option> options)
	{
		optionList.addAll(options);
	}

	/**
	 * Writes out a menu, and requests user input to select an option and run it.
	 */
	public void runSelection()
	{
		System.out.println("- - " + selectionName + " - -");
		System.out.println("Vælg ind af de følgende muligheder, ved at indtaste tallet:");
		if (isCancellable)
		{
			System.out.println("[0] Cancel");
		}
		int count = 1;
		for (Option option : optionList)
		{
			System.out.println("[" + count + "] " + option.getDescription()); // [1] Example Option
			count++;
		}
		System.out.println(""); // creates an empty line for spacing purposes.

		Option selectedOption = selectOption();
		
		if (selectedOption != null) {
			selectedOption.runOption();
		}
	}
	
	/**
	 * Uses user input to select an option from the list.
	 * @return A specified option, or null if cancel is chosen.
	 */
	private Option selectOption() {
		int rangeMax = optionList.size();
		int rangeMin = 0;
		boolean selected = false;
		Option selectedOption = null;
		while (selected == false)
		{
			int index;
			index = InputHandler.getIntInput() - 1;
			if (rangeMin <= index && index < rangeMax)
			{
				selectedOption = optionList.get(index);
				selected = true;
			} else if (isCancellable && index == -1)
			{
				selected = true;
			}
			else {
				System.out.println("Ikke en mulighed");
			}
		}
		return selectedOption;
	}
}
