package ProjetMyUber;

public class Confirmed implements RideState {

	@Override
	public void doAction(Ride ride) {
		System.out.println("Ride is confirmed");
		ride.setState(this);
	}
	public String toString() {
		return "Confirmed";
	}
}
