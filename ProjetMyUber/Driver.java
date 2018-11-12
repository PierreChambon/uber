package ProjetMyUber;

public abstract class Driver {
	MyUber myUber;//Permet de dire à quelle application Uber le fichier client est rattaché
	public abstract void setState(DriverState state);//Il s'agit d'un pattern state pour gérer l'état du driver
	public abstract DriverState getState();
	public abstract void takeBooking (Booking booking);
	public abstract void placeBookings();
	public abstract void ask(GPS gpsArrival);//pour demander si le conducteur veut accepter une commande
}
