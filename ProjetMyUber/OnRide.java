package ProjetMyUber;

public class OnRide implements DriverState {

	@Override
	public void doAction(Driver driver) {
		System.out.println("Driver is on ride");
		driver.setState(this);

	}
	public String toString() {
		return "On a ride";
	}
}