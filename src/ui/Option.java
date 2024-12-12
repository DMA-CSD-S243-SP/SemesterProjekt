package ui;

/**
 * Abstract superclass for selectable options in menu.
 */
public abstract class Option
{
	private String description; // The text displayed in the menu
	
	public Option(String description) {
		this.description = description;
	}
	
	/**
	 * The method that gets run, whenever an option is selected. 
	 */
	abstract void runOption();
	
	public String getDescription() {
		return description;
	}
	
}
