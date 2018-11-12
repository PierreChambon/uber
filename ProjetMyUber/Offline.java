package ProjetMyUber;

public class Offline implements DriverState {

	@Override
	public void doAction(Driver driver) {
		System.out.println("Driver is offline");
		driver.setState(this);

	}
	public String toString() {
		return "Offline";
	}
}
