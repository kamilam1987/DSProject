package ie.gmit.ds.client.model;

import java.io.Serializable;

/**
 * @author Kamila
 *
 */

/**
 * Class Customer implements the Serializable interface. Use of the constant
 * serialVersionUID. This class field is used to check during unmarshalling
 * (deserialization)
 */
public class Customer implements Serializable{
	/**
	 * Declare variables
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String firstname;
	private String lastname;
	
	/**
	 * Generate setters
	 * and getters for customer
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
		

}
