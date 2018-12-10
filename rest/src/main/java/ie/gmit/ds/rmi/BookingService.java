package ie.gmit.ds.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import ie.gmit.ds.model.*;

public interface BookingService extends Remote{
	
	
	public int createBooking(Booking booking) throws RemoteException;
	public Booking getBooking(int id) throws RemoteException;
	public int createCustomer(Customer customer) throws RemoteException;
	public List<Booking> getBookings() throws RemoteException;
	public int updateBooking(Booking booking) throws RemoteException;
	public CarList getCars() throws RemoteException;
	//public int deleteBooking(Booking booking) throws RemoteException;
	public int deleteBooking(int id) throws RemoteException;
	
	
}
