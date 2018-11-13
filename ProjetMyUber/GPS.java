
package ProjetMyUber;
import javafx.util.Pair;

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
	public Pair convertRad() {
		
	}

}
