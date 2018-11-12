package ProjetMyUber;
import java.util.ArrayList;

public abstract class Customer {

	
	/**
	 * This lastID attribute represents the last ID given to a Customer. To give an ID to a new customer, one needs to increment this integer.
	 */
	static int lastID = 0;
	
	private int customerID;
	private Identity identity;
	private GPS localization;
	private CreditCard creditCard;
	private ArrayList<String> messageBox;

	protected MyUber myUber;//Permet de dire à quelle application Uber le fichier client est rattaché
	public abstract void askBooking(GPS gpsArrival);
	
	public Customer(Identity identity, GPS localization, CreditCard creditCard){
		this.identity = identity;
		this.localization = localization;
		this.creditCard = creditCard;
		this.messageBox = new ArrayList<String>();
		
		Customer.lastID++;
		this.setCustomerID(Customer.lastID);
	}

	/**
	 * @return the identity
	 */
	public Identity getIdentity() {
		return identity;
	}

	/**
	 * @param identity the identity to set
	 */
	public void setIdentity(Identity identity) {
		this.identity = identity;
	}

	/**
	 * @return the localization
	 */
	public GPS getLocalization() {
		return localization;
	}

	/**
	 * @param localization the localization to set
	 */
	public void setLocalization(GPS localization) {
		this.localization = localization;
	}

	/**
	 * @return the creditCard
	 */
	public CreditCard getCreditCard() {
		return creditCard;
	}

	/**
	 * @param creditCard the creditCard to set
	 */
	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", identity=" + identity + ", localization=" + localization
				+ ", creditCard=" + creditCard + ", messageBox=" + messageBox + "]";
	}
	
	public abstract void update();

	public ArrayList<String> getMessageBox() {
		return messageBox;
	}

	public void setMessageBox(ArrayList<String> messageBox) {
		this.messageBox = messageBox;
	}
	
	public void addMessage(String message) {
		this.getMessageBox().add(message);
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}


}