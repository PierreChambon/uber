
package ProjetMyUber;
import java.lang.Double;

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
		System.out.println(latConversion);
		return latConversion;
		
	}
	public static void main(String[] args) {
		GPS gps=new GPS(90,13);
		gps.convertLatRad();
	}
	

}
