package ie.gmit.ds.model;

import java.io.Serializable;

public class Booking  implements Serializable{
	private String carid;
	private int customerid;
	private String bookingfrom;
	private String bookingto;
	private String time;
	private int id;
	
	public String getCarid() {
		return carid;
	}
	public void setCarid(String carid) {
		this.carid = carid;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
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
