package ie.gmit.ds.client.model;

import java.io.Serializable;

/**
 * @author Kamila
 *
 */

/** Car which implements the Serializable interface. 
 * Use of the constant serialVersionUID.
 * This class field is used to check during unmarshalling (deserialization)
 */

public class Car implements Serializable{
	
	//Declare variables
	private static final long serialVersionUID = 1L;
	private String id;
	private String model;
	private String make;

	//Generate setters and getters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
}
