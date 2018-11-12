package ProjetMyUber;

public class Ongoing implements RideState {

	@Override
	public void doAction(Ride ride) {
		System.out.println("Ride is ongoing");
		ride.setState(this);
	}
	public String toString() {
		return "Ongoing";
	}

}
