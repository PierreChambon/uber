package ProjetMyUber;

public abstract class AbstractFactory {
	
	/**
	 * This method creates a new customer of a certain customerType. 
	 * 
	 * @param customerType the type of customer
	 * @param identity the identity 
	 * @param localisation the localization of the customer (GPS object)
	 * @param creditCard the credit card 
	 * @return a new customer
	 */
	public abstract Customer addCustomer(CustomerType customerType, Identity identity, GPS localisation, CreditCard creditCard);
}

