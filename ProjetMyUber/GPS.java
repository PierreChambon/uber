
package ProjetMyUber;


public class GPS {
	
	private int latitude;
	private int longitude;
	
	/**
	 *  A class for the GPS position of a system (person or object)
	 * latitude and longitude are in degrees
	 */
	
	public GPS(int latitude, int longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GPS [latitude=" + latitude + ", longitude=" + longitude + "]";
	}

	/**
	 * @return the latitude
	 */
	public int getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the longitude
	 */
	public int getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}
	/**
	 * @return pair of coordinates in radians
	 */
	public double convertLatRad() {
		double latConversion=(double) ( (this.latitude)*(Math.PI)/180);
		return latConversion;
		
	}
	/**
	 * @return pair of coordinates in radians
	 */
	public double convertLongRad() {
		double longConversion=(double) ( (this.longitude)*(Math.PI)/180);
		return longConversion;
	}
	/**
	 * @param gps2
	 * @return distance between two gps coordinates
	 */
	public int distance(GPS gps2) {
	/**
	 * r is the radius of the Earth
	 * if something doesn t work, it is because of the calcul at the end of the function, which
	 * should give us the distance between the two coordinates
	 */
		int r=6378000;
		double lata=this.convertLatRad();
		double longa=this.convertLongRad();
		double latb=gps2.convertLatRad();
		double longb=gps2.convertLongRad();
		double d=r*(Math.PI/2 - Math.asin(Math.sin(latb)*Math.sin(lata)+Math.cos(longb-longa)*Math.cos(latb)*Math.cos(lata)));
		return (int) d;
	}
	public static void main(String[] args) {
		GPS gps=new GPS(0,0);
		GPS gps2=new GPS(0,180);
		System.out.println(gps.distance(gps2));
	}
	

}
