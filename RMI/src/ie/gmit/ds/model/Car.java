package ie.gmit.ds.model;

import java.io.Serializable;
/**
 * @author Kamila
 *
 */

/**
 * Class Car implements the Serializable interface. Use of the constant
 * serialVersionUID. This class field is used to check during unmarshalling
 * (deserialization)
 */
public class Car implements Serializable{
	/**
	 * Declare variables:
	 *  id - car id 
	 *  model - model of a car 
	 *  make - make of a car
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String model;
	private String make;

	/**
	 * @return car id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id sets car id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return model of a car
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model sets model of a car
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return make of a car
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @param make sets make of a car
	 */
	public void setMake(String make) {
		this.make = make;
	}

}
