package ProjetMyUber;

public class LowTraffic implements TrafficState {

	@Override
	public void doAction(Ride ride) {
		System.out.println("Traffic is low");
		ride.setTraffic(this);
	}
	public String toString() {
		return "low-traffic";
	}

}
