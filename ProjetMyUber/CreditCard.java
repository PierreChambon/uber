package ProjetMyUber;

import java.time.LocalDate;

public class CreditCard {

	private int cardNumber;
	private LocalDate expirationDate;
	private String cardHolderName;
	private int securityCode;
	private CardType cardType;
	
	/**
	 * 
	 * @param cardType type of the card (cardType enumeration)
	 * @param cardNumber number of the card
	 * @param expirationDate the expiration date
	 * @param securityCode the security code
	 * @param cardHolderName the card holder name which is written on the card
	 */
	public CreditCard(CardType cardType, int cardNumber, LocalDate expirationDate, int securityCode, String cardHolderName) {
		this.cardNumber = cardNumber;
		this.expirationDate = expirationDate;
		this.cardHolderName = cardHolderName;
		this.securityCode = securityCode;
		this.cardType = cardType;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CreditCard [cardNumber=" + cardNumber + ", expirationDate=" + expirationDate + ", cardHolderName="
				+ cardHolderName + ", securityCode=" + securityCode + ", cardType=" + cardType + "]";
	}


	/**
	 * @return the cardNumber
	 */
	public int getCardNumber() {
		return cardNumber;
	}


	/**
	 * @param cardNumber the cardNumber to set
	 */
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}


	/**
	 * @return the expirationDate
	 */
	public LocalDate getExpirationDate() {
		return expirationDate;
	}


	/**
	 * @param expirationDate the expirationDate to set
	 */
	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}


	/**
	 * @return the cardHolderName
	 */
	public String getCardHolderName() {
		return cardHolderName;
	}


	/**
	 * @param cardHolderName the cardHolderName to set
	 */
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}


	/**
	 * @return the securityCode
	 */
	public int getSecurityCode() {
		return securityCode;
	}


	/**
	 * @param securityCode the securityCode to set
	 */
	public void setSecurityCode(int securityCode) {
		this.securityCode = securityCode;
	}


	/**
	 * @return the cardType
	 */
	public CardType getCardType() {
		return cardType;
	}


	/**
	 * @param cardType the cardType to set
	 */
	public void setCardType(CardType cardType) {
		this.cardType = cardType;
	}
}
