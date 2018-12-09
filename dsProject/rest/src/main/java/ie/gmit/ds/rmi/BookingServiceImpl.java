package ie.gmit.ds.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

import ie.gmit.ds.model.Booking;
import ie.gmit.ds.model.CarList;
import ie.gmit.ds.model.Customer;

public class BookingServiceImpl implements BookingService {
	private BookingService bs;

	public BookingServiceImpl() throws MalformedURLException, RemoteException, NotBoundException {
		bs = (BookingService) Naming.lookup("rmi://127.0.0.1:1099/carhire");
	}

	@Override
	public int createBooking(Booking booking) throws RemoteException {
		return bs.createBooking(booking);
	}

	@Override
	public int createCustomer(Customer customer) throws RemoteException {
		return bs.createCustomer(customer);
	}

	@Override
	public List<Booking> getBookings() throws RemoteException {
		return bs.getBookings();
	}

	@Override
	public int updateBooking(Booking booking) throws RemoteException {
		return bs.updateBooking(booking);
	}

	@Override
	public Booking getBooking(int id) throws RemoteException {
		return bs.getBooking(id);
	}

	@Override
	public CarList getCars() throws RemoteException {
		return bs.getCars();
	}

}
