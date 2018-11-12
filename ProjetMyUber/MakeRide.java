package ProjetMyUber;

public class MakeRide implements Booking {
	private Ride ride;
	
	public MakeRide (Ride ride) {
		this.ride=ride;
	}
	@Override
	public void placeBooking() {
		// TODO Auto-generated method stub
		ride.make();
	}

}
