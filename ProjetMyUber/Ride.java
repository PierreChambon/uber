package ProjetMyUber;

public abstract class Ride {//On se pose la question si c'est malin de n'implémenter que une seule interface ! Mais a t on besoin de flexibilité à ce niveau là ?
	MyUber myUber;//Permet de dire à quelle application Uber le fichier client est rattaché
	public abstract void setState(RideState state);//Il s'agit du pattern state pour le state du ride
	public abstract RideState getState();
	public abstract void setTraffic(TrafficState state);//Il s'agit du pattern state pour le state du traffic
	public abstract TrafficState getTraffic();
	public abstract float getPrice();//Il s'agit d'un strategy pattern pour pouvoir avoir le prix : en effet l'algorithme à plusieurs versions !
	public abstract void make();//Il s'agit du command pattern, cette méthode pour dire que la course est en cours
	public abstract void sell();//Il s'agit d'une command pour dire que la course est terminée
	public abstract void attach(Customer customer);//Il s'agit ici du pattern observer/obserrvable
	public abstract void notifyCustomers();
}

