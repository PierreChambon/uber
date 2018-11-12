package ProjetMyUber;

import java.util.ArrayList;
import java.util.List;

public class MyUber {
	private List<Booking> bookingList= new ArrayList<>();
	private List<Driver> driverList=new ArrayList<>();
	public void takeBooking(Booking booking) {//Evidemment le développement de ces fonction de booking n'est que au stade primaire, il faut compléter leur définition avec les requirements du projet
		bookingList.add(booking);
	}
	public void placeBookings() {
		for (Booking booking:bookingList) {
			if (booking instanceof AskRequest) {
//On rajoute ici la plus value de l'application myUber, ie elle connaît les drivers
				
			}else {
				booking.placeBooking();//exécute l'ordre
			}
		}
		bookingList.clear();
	}

}
