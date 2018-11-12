package ProjetMyUber;

public class MediumTraffic implements TrafficState {

	@Override
	public void doAction(Ride ride) {
		System.out.println("Traffic is medium");
		ride.setTraffic(this);
	}
	public String toString() {
		return "medium traffic";
	}

}
