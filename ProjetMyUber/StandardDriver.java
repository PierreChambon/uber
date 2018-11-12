package ProjetMyUber;
import java.util.*;
public class StandardDriver extends Driver {
	private DriverState state;
	private List<Booking> bookingList= new ArrayList<>();
	public StandardDriver() {
		state=null;
		
	}
	public void setState(DriverState state) {
		this.state=state;
	}
	public DriverState getState() {
		return state;
	}
	public void takeBooking(Booking booking) {//Evidemment le développement de ces fonction de booking n'est que au stade primaire, il faut compléter leur définition avec les requirements du projet
		bookingList.add(booking);
	}
	public void placeBookings() {
		for (Booking booking:bookingList) {
			booking.placeBooking();
		}
		bookingList.clear();
	}
	

	public void ask(GPS gpsArrival) {
		//Demande au driver si il veut bien accepter la ride
		//Si oui, ben il accepte sinon faut faire autre chose
		Scanner scan = new Scanner(System.in);
		//This display a message for the user
		System.out.print("Do you want to accept a ride to "+gpsArrival+" ?Yes/No");
		boolean correctResult=false; 
		String str = scan.nextLine();
		//Closing scanner after the use 
		while (!correctResult) {
			if (str=="Yes") {
				correctResult=true;
				//exécuter la fonction adéquate
			}else if(str=="No") {
				correctResult=true;
				//exécuter la fonction adéquate
			}else {
				System.out.println("Answer by Yes or No");
				str=scan.nextLine();
			}
		}
		scan.close();
	}
}

