package ui;

import java.util.Scanner;
import application.OrderController;
import model.Customer;

public class SaleUI extends Option
{

	public SaleUI()
	{
		super("Start salg");
	}

	@Override
	void runOption()
	{
		OrderController orderControl = new OrderController();
		Scanner input = new Scanner(System.in);
		// makeNewOrder
		orderControl.makeNewOrder();

		// addCustomerByPhone(phone)
		boolean isCustomerFound = false;
		while (isCustomerFound == false)
		{
			System.out.println("\n\nIndtast kundens telefonnummer");

			Customer foundCustomer;
			String phone = input.nextLine();
			try
			{
				foundCustomer = orderControl.addCustomerByPhoneNumber(phone);
				isCustomerFound = true;
				System.out.println("Customer Hash: " + foundCustomer); // Uses Customer.toString(). Returns hashcode,
																		// should be changed.
			} catch (NullPointerException exception)
			{
				System.out.println(exception.getMessage());
			}
		}

		// enterProduct(productID, quantity)
		boolean isDone = false;
		while (isDone == false)
		{
			String exitCode = "n";
			System.out.println("\n\nRegister produkt, eller slut order ved [" + exitCode + "]");
			String productID = input.nextLine();
			if (productID.equals(exitCode)) // endSale
			{
				isDone = true;
			}

			int quantity = 0;
			if (isDone == false)
			{
				while (quantity <= 0)
				{
					System.out.println("\n\nRegister antal");
					String inputLine = input.nextLine();
					if (inputLine.equals(""))
					{
						quantity = 1;
					} else
					{
						try
						{
							quantity = Integer.parseInt(inputLine);
						} catch (NumberFormatException exception)
						{
							System.out.println("Antallet er ikke gyldigt");
						}
					}

				}
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
		input.close();
		orderControl.endSale();
	}

}