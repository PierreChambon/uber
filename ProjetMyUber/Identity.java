
package ProjetMyUber;

import java.time.LocalDate;

public class Identity {

	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private Gender gender;
	
	/**
	 *  This class gives the identity of a Customer
	 */
	
	/**
	 * 
	 * @param firstName The first name
	 * @param lastName The last name
	 * @param birthDate the date of birth : LocalDate.of(yyyy,mm,dd)
	 * @param gender A MAN or a WOMAN from the Gender enumeration
	 */
	public Identity(String firstName, String lastName, LocalDate birthDate, Gender gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.gender = gender;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Identity [firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate + ", gender="
				+ gender + "]";
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the birthDate
	 */
	public LocalDate getBirthDate() {
		return birthDate;
	}

	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * @return the gender
	 */
	public Gender getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	
	public static void main(String[] args) {
		
		Identity identity1 = new Identity("Arié", "Selinger", LocalDate.of(1998,03,25), Gender.MAN);
		
		System.out.println(identity1);
		
	}
	
	
	

}
