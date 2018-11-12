package ProjetMyUber;
import java.util.ArrayList;
import java.util.List;

public class AskRequest implements Booking {
	private  Driver driver;//le driver auquel on veut actuellement demander la requ�te
	private GPS gpsArrival;
	public AskRequest() {
		
	}
	public AskRequest(GPS gpsArrival, Driver driver) {
		this.driver=driver;
		this.gpsArrival=gpsArrival;
	}
	@Override
	public void placeBooking() {
		driver.ask(gpsArrival);

	}

}
