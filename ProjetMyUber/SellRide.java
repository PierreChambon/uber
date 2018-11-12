package ProjetMyUber;

public class SellRide implements Booking {//Après avoir fait une course, le driver vend au client le coût de l'application.. Ou non ! Avant d'avoir fait la course !!!
	private Ride ride;

	public SellRide(Ride ride) {
		this.ride=ride;
	}
	@Override
	public void placeBooking() {
		// TODO Auto-generated method stub
		ride.sell();
	}

}
