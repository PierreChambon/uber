package ProjetMyUber;

public class Completed implements RideState {

	@Override
	public void doAction(Ride ride) {
		System.out.println("Ride is completed");
		ride.setState(this);
	}
	public String toString() {
		return "Completed";
	}

}
