package ie.gmit.ds.model;

import java.io.Serializable;

public class Car implements Serializable{
	
	private String id;
	private String model;
	private String make;

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
