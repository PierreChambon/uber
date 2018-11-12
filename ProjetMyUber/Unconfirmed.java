package ProjetMyUber;

public class Unconfirmed implements RideState {

	@Override
	public void doAction(Ride ride) {
		System.out.println("Ride is unconfirmed");
		ride.setState(this);
	}
	public String toString() {
		return "Unconfirmed";
	}

}
