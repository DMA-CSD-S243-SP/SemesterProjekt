package ui;

import application.OrderController;
import model.Customer;

/**
 * Represents the option in the user interface that handles the Make Sale use case.
 *
 * The SaleUI class models the behavior of the option that handles creating and registering 
 * an order through the inputs supplied through interactions between the system and the user,
 * eventually resulting in an order being persisted.
 * 
 * 
 * @author Lumière Schack & Christoffer Søndergaard
 * @version 12/12/2024 - 22:20
 */

/**
 * The option that handles the Make Sale use case
 */
public class SaleUI extends Option
{
	// Text Config
	// The name of the option in menus:
	final static String optionText = "Start Salg";
	// The text used to request a phonenumber:
	final static String phoneRequest = "Indtast kundens telefonnummer";
	// The text that requests a product id or an exit code. Note the exit code
	// follows right after this statement:
	final static String productAndExitRequest = "Registrer produkt, eller slut order ved";
	// The code that needs to be typed in to end a sale:
	final static String exitCode = "n";
	// Error message for invalid customer:
	final static String customerNotFound = "Ingen kunde er registreret med det nummer";
	// Error message for invalid product:
	final static String productNotFound = "Intet produkt er registreret med det ID";

	OrderController orderControl;

	public SaleUI()
	{
		super(optionText); // All instances of SaleUI should have the same descriptive text.
	}

	@Override
	void runOption()
	{
		orderControl = new OrderController();

		// Operation contract: makeNewOrder
		orderControl.makeNewOrder(); // The user input for makeNewOrder is selecting SaleUI

		// Operation contract: addCustomerByPhone(phone)
		boolean isCustomerFound = false;

		while (isCustomerFound == false)
		{
			System.out.println("\n\n" + phoneRequest);
			String phone = InputHandler.getInput();
			isCustomerFound = tryAddCustomerByPhone(phone);
		}

		// Operation contract: enterProduct(productID, quantity)
		boolean isDone = false;

		while (isDone == false)
		{
			System.out.println("\n\n" + productAndExitRequest + "[" + exitCode + "]");
			String productID = InputHandler.getInput(); // This getInput handles 2 operations, by the use of an exit
														// code.

			if (productID.equals(exitCode)) // Operation contract: endSale
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
		}

		catch (NullPointerException exception) // Gets thrown if phone number hasn't been mapped to a Customer
		{
			System.out.println(customerNotFound);
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
				quantity = InputHandler.getIntInput();
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
	 * @return true if the product was succesfully entered.
	 */
	private boolean tryEnterProduct(String productID, int quantity)
	{
		try
		{
			double total = orderControl.enterProduct(productID, quantity);
			System.out.println("\n\nTotal: " + total);
			return true;
		}

		catch (NullPointerException exception) // Gets thrown if productID hasn't been mapped to a Product.
		{
			System.out.println(productNotFound);
			return false;
		}
	}
}