package ProjetMyUber;

public class OffDuty implements DriverState {

	@Override
	public void doAction(Driver driver) {
		System.out.println("Driver is offduty");
		driver.setState(this);

	}
	public String toString() {
		return "Offduty";
	}
}