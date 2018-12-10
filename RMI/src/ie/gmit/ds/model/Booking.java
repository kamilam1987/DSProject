package ie.gmit.ds.model;

import java.io.Serializable;

/**
 * @author Kamila
 *
 */

/** Booking which implements the Serializable interface. 
 * Use of the constant serialVersionUID.
 * This class field is used to check during unmarshalling (deserialization)
 */

public class Booking implements Serializable {
	
	//Declare variables
	private static final long serialVersionUID = 1L;
	private Car car;
	private Customer customer;
	private String bookingfrom;
	private String bookingto;
	private String time;
	private int id;

	//Generate setters and getters
	public Car getCar() {
		return car;
	}
	
	public void setCar(Car car) {
		this.car = car;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getBookingfrom() {
		return bookingfrom;
	}

	public void setBookingfrom(String bookingfrom) {
		this.bookingfrom = bookingfrom;
	}

	public String getBookingto() {
		return bookingto;
	}

	public void setBookingto(String bookingto) {
		this.bookingto = bookingto;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
