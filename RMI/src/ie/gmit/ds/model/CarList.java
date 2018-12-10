package ie.gmit.ds.model;

import java.io.Serializable;
import java.util.List;
/**
 * @author Kamila
 *
 */

/**
 * Class CarList implements the Serializable interface. Use of the constant
 * serialVersionUID. This class field is used to check during unmarshalling
 * (deserialization)
 */
public class CarList implements Serializable {
	/**
	 * Declare variables
	 */
	private static final long serialVersionUID = 1L;
	private List<Car> car;
	
	/**
	 * @return list of available cars
	 */
	public List<Car> getCar() {
		return car;
	}

	/**
	 * @param car sets the car list
	 */
	public void setCar(List<Car> car) {
		this.car = car;
	}
}
