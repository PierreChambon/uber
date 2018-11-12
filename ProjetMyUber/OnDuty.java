package ProjetMyUber;

public class OnDuty implements DriverState {

	@Override
	public void doAction(Driver driver) {
		System.out.println("Driver is onduty");
		driver.setState(this);

	}
	public String toString() {
		return "Onduty";
	}
}