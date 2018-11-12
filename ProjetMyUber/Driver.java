package ProjetMyUber;

public abstract class Driver {
	MyUber myUber;//Permet de dire � quelle application Uber le fichier client est rattach�
	public abstract void setState(DriverState state);//Il s'agit d'un pattern state pour g�rer l'�tat du driver
	public abstract DriverState getState();
	public abstract void takeBooking (Booking booking);
	public abstract void placeBookings();
	public abstract void ask(GPS gpsArrival);//pour demander si le conducteur veut accepter une commande
}
