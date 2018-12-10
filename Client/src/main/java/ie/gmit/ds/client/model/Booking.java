package ie.gmit.ds.client.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Kamila
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Booking", namespace = "http://client.ds.gmit.ie/model")
@XmlRootElement
public class Booking implements Serializable {
	/**
	 * Declare Variables 
	 * car - car available for booking
	 * customer - customer that makes booking 
	 * bookingfrom - starts date for booking 
	 * boookingto - end date for boking
	 * id - booking id
	 */
	private static final long serialVersionUID = 1L;
	private Car car;
	private Customer customer;
	private String bookingfrom;
	private String bookingto;
	private String time;
	private int id;

	/**
	 * @return car type in booking
	 */
	public Car getCar() {
		return car;
	}

	/**
	 * @param car sets type of a car in booking
	 */
	public void setCar(Car car) {
		this.car = car;
	}

	/**
	 * @return customer in booking
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer sets customer in booking
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @return bookingfrom which returns start date for booking
	 */
	public String getBookingfrom() {
		return bookingfrom;
	}

	/**
	 * @param bookingfrom sets the start date for booking
	 */
	public void setBookingfrom(String bookingfrom) {
		this.bookingfrom = bookingfrom;
	}

	/**
	 * @return bookingto which returns end date for booking
	 */
	public String getBookingto() {
		return bookingto;
	}

	/**
	 * @param bookingto sets end date for booking
	 */
	public void setBookingto(String bookingto) {
		this.bookingto = bookingto;
	}

	/**
	 * @return booking time
	 */
	public String getTime() {
		return time;
	}

	/**
	 * @param time sets the booking time
	 */
	public void setTime(String time) {
		this.time = time;
	}

	/**
	 * @return booking id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id sets booking id
	 */
	public void setId(int id) {
		this.id = id;
	}

}
