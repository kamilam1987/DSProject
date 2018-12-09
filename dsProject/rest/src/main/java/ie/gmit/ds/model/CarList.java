package ie.gmit.ds.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarList", namespace = "http://ds.gmit.ie/model")
@XmlRootElement
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
