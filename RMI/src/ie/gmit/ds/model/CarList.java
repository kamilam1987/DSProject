package ie.gmit.ds.model;

import java.io.Serializable;
import java.util.List;

public class CarList implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Car> car;
	public List<Car> getCar() {
		return car;
	}
	public void setCar(List<Car> car) {
		this.car = car;
	}
}
