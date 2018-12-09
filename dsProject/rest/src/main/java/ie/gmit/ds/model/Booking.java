package ie.gmit.ds.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Booking", namespace = "http://ds.gmit.ie/model")
@XmlRootElement
public class Booking  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Car car;
	private Customer customer;
	private String bookingfrom;
	private String bookingto;
	private String time;
	private int id;
	
	
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
