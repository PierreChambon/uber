package ProjetMyUber;

public class HeavyTraffic implements TrafficState {

	@Override
	public void doAction(Ride ride) {
		System.out.println("Traffic is heavy");
		ride.setTraffic(this);
	}
	public String toString() {
		return "heavy traffic";
	}

}
