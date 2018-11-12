package ProjetMyUber;
import java.util.*;
public class UberVan extends Ride {
	private RideState state;
	private TrafficState traffic;
	private float price; // NB il faudra rajouter une fonction qui calcule le coût
	private List<Customer> customers=new ArrayList<>();
	public UberVan() {
		state=null;
		
	}
	public void setState(RideState state) {
		this.state=state;
	}
	public RideState getState() {
		return state;
	}
	public void setTraffic(TrafficState traffic) {
		this.traffic=traffic;
		notifyCustomers();
	}
	public TrafficState getTraffic() {
		return traffic;
	}
	public float getPrice() {
		return this.price;
	}
	public void make() {
		System.out.println("La course est en cours");//On peut penser à imprimer un String avec l'identifiant de la course
	}
	public void sell() {
		System.out.println("La course est terminée");//Pareil on peut penser à imprimer un identifiant
	}
	public void attach(Customer customer) {
		customers.add(customer);
	}
	public void notifyCustomers() {
		for (Customer customer: customers) {
			customer.update();
		}
	}
}