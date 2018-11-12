package ProjetMyUber;

public class CustomerFactory extends AbstractFactory {

	@Override
	public Customer addCustomer(CustomerType customerType, Identity identity, GPS localisation, CreditCard creditCard) {
		switch(customerType) {
			case StandardCustomer : 
				Customer customer = new StandardCustomer(identity, localisation, creditCard);
				return customer;
			default : 
				return null;
		}
	}
}
