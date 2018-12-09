package ie.gmit.ds.rest;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ie.gmit.ds.model.CarList;
import ie.gmit.ds.rmi.BookingService;
import ie.gmit.ds.rmi.BookingServiceImpl;

/**
 * Root resource (exposed at "booking" path)
 */
@Path("cars")
public class CarResource {
	private BookingService bs;

	public CarResource() {

		try {
			bs = new BookingServiceImpl();
		} catch (RemoteException | MalformedURLException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public CarList getCars() {
		CarList cl=null;
		try {
			cl = bs.getCars();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cl;
	}
}