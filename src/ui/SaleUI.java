package ui;

import application.OrderController;
import model.Customer;

public class SaleUI extends Option
{
	// Text Config
	final static String optionText = "Start Salg"; // The name of the option in menus
	final static String phoneRequest = "Indtast kundens telefonnummer"; // The text used to request a phonenumber
	final static String productAndExitRequest = "Registrer produkt, eller slut order ved"; //
	final static String invalidNumber = "Antallet er ikke gyldigt";
	final static String exitCode = "n";

	OrderController orderControl;

	public SaleUI()
	{
		super(optionText);
	}

	@Override
	void runOption()
	{
		orderControl = new OrderController();
		// makeNewOrder
		orderControl.makeNewOrder();

		// addCustomerByPhone(phone)
		boolean isCustomerFound = false;
		while (isCustomerFound == false)
		{
			System.out.println("\n\n" + phoneRequest);
			String phone = InputHandler.getInput();
			isCustomerFound = tryAddCustomerByPhone(phone);
		}

		// enterProduct(productID, quantity)
		boolean isDone = false;
		while (isDone == false)
		{
			System.out.println("\n\n" + productAndExitRequest + "[" + exitCode + "]");
			String productID = InputHandler.getInput();
			if (productID.equals(exitCode)) // endSale
			{
				isDone = true;
			}

			if (isDone == false)
			{
				int quantity = inputQuantity();
				tryEnterProduct(productID, quantity);
			}

		}

		orderControl.endSale();
		orderControl = null;
	}

	/**
	 * Tries to add a customer to the Order, and prints either information about the
	 * customer, or an error code.
	 * 
	 * @return true if a customer was added.
	 */
	private boolean tryAddCustomerByPhone(String phone)
	{
		try
		{
			Customer foundCustomer = orderControl.addCustomerByPhoneNumber(phone);
			System.out.println("Customer Hash: " + foundCustomer); // Uses Customer.toString(). Returns hashcode,
																	// should be changed.
			return true;
		} catch (NullPointerException exception)
		{
			System.out.println(exception.getMessage());
			return false;
		}
	}

	/**
	 * Requests input until a valid quantity is given.
	 * 
	 * @return the quantity given.
	 */
	private int inputQuantity()
	{
		int quantity = 0;
		while (quantity <= 0) // Retries if quantity hasn't been set yet, or has been set to a non-positive
								// number
		{
			System.out.println("\n\nRegister antal");
			String inputLine = InputHandler.getInput();
			if (inputLine.equals("")) // Allows quick input of a single product, by hitting enter
			{
				quantity = 1;
			} else
			{
				try
				{
					quantity = Integer.parseInt(inputLine);
				} catch (NumberFormatException exception)
				{
					System.out.println(invalidNumber);
				}
			}

		}
		return quantity;
	}

	/**
	 * Tries to enter a product with it's quantity, prints total if succesful, and
	 * an error message if not
	 * 
	 * @param productID
	 * @param quantity
	 */
	private void tryEnterProduct(String productID, int quantity)
	{
		try
		{
			double total = orderControl.enterProduct(productID, quantity);
			System.out.println("\n\nTotal: " + total);
		} catch (NullPointerException exception)
		{
			System.out.println(exception.getMessage());
		}
	}
}