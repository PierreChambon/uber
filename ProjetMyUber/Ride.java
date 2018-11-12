package ProjetMyUber;

public abstract class Ride {//On se pose la question si c'est malin de n'impl�menter que une seule interface ! Mais a t on besoin de flexibilit� � ce niveau l� ?
	MyUber myUber;//Permet de dire � quelle application Uber le fichier client est rattach�
	public abstract void setState(RideState state);//Il s'agit du pattern state pour le state du ride
	public abstract RideState getState();
	public abstract void setTraffic(TrafficState state);//Il s'agit du pattern state pour le state du traffic
	public abstract TrafficState getTraffic();
	public abstract float getPrice();//Il s'agit d'un strategy pattern pour pouvoir avoir le prix : en effet l'algorithme � plusieurs versions !
	public abstract void make();//Il s'agit du command pattern, cette m�thode pour dire que la course est en cours
	public abstract void sell();//Il s'agit d'une command pour dire que la course est termin�e
	public abstract void attach(Customer customer);//Il s'agit ici du pattern observer/obserrvable
	public abstract void notifyCustomers();
}

