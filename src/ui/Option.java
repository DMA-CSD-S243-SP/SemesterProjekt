package ui;

public abstract class Option
{
	private String description;
	
	public Option(String description) {
		this.description = description;
	}
	
	abstract void runOption();
	
	public String getDescription() {
		return description;
	}
	
}
