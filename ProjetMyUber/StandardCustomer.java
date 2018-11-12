package ProjetMyUber;

import java.time.LocalDate;

public class StandardCustomer extends Customer {
	protected Ride ride;

	public StandardCustomer(Identity identity, GPS localization, CreditCard creditCard) {
		super(identity, localization, creditCard);
		this.ride=null;
	}
	public void update() {
		if(this.ride.getTraffic().toString().equalsIgnoreCase("low-traffic")) {
			System.out.println("Customer is happy");
		}else {
			System.out.println("Customer is unhappy");
		}
	}
	public void askBooking(GPS gpsArrival) {
		StandardDriver nullDriver=new StandardDriver();//A priori on ne sait pas � quel driver la requette va �tre donn�e
		AskRequest askRequest=new AskRequest(gpsArrival,nullDriver);//On lui met en param�tre des donn�es que le GPS car on sous entend que cela s'adresse � l'ensemble des drivers
		this.myUber.takeBooking(askRequest);//demande � myUber de chercher un driver pour la requ�te.L'nt�ret de passer par myUber est que c'est lui qui g�re tous les trucs compliqu�s en background
		this.myUber.placeBookings();
	}
	
	public static void main(String[] args) {
		
		StandardCustomer c1 = new StandardCustomer(
				new Identity("Arié", "Selinger", LocalDate.of(1998, 03, 25), Gender.MAN), 
				new GPS(0, 0), 
				new CreditCard(CardType.Visa, 0000000000000001, LocalDate.of(2018, 03, 01), 756, "MR ARIE SELINGER")
		);
		
		StandardCustomer c2 = new StandardCustomer(
				new Identity("Pierre", "Chambon", LocalDate.of(1998, 03, 26), Gender.MAN), 
				new GPS(0, 0), 
				new CreditCard(CardType.Visa, 0000000000000001, LocalDate.of(2018, 03, 01), 756, "MR PIERRE CHAMBON")
		);
		
		System.out.println(c1);
		System.out.println(c2);
		
	}
}

