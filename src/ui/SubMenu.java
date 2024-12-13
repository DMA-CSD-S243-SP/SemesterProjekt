package ui;

public class SubMenu extends Option
{

	public SubMenu()
	{
		super("Sub Menu");
	}

	@Override
	void runOption()
	{
		OptionSelection subMenu = new OptionSelection("Sub Menu", true);
		subMenu.addOption(new SaleUI());
		subMenu.runSelection();

	}

}
