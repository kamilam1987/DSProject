package ie.gmit.ds.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import ie.gmit.ds.model.*;

public interface BookingService extends Remote{
	public int createBooking(Booking booking) throws RemoteException;
	public int createCustomer(Customer customer) throws RemoteException;
}
