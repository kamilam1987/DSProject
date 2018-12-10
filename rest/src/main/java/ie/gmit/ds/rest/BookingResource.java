package ie.gmit.ds.rest;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import ie.gmit.ds.model.*;
import ie.gmit.ds.rmi.*;

/**
 * Root resource (exposed at "booking" path)
 */
@Path("booking")
public class BookingResource {
	private BookingService bs;

	public BookingResource() {

		try {
			bs = new BookingServiceImpl();
		} catch (RemoteException | MalformedURLException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@POST
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_XML)
	public Response createBooking(Booking b) {
		int id = -1;
		try {
			id = bs.createBooking(b);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Response.status(200).entity(Integer.toString(id)).build();
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_XML)
	public Response updateBooking(Booking b) {
		int id = -1;
		try {
			id = bs.updateBooking(b);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Response.status(200).entity(Integer.toString(id)).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/{id}")
	public Booking getBooking(@PathParam("id") int id) {
		Booking b=null;
		try {
			b = bs.getBooking(id);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}
	
	
	@DELETE
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_XML)
	@Path("/{id}")
	public Response deleteBooking(@PathParam("id") int id) {		
		try {
			id = bs.deleteBooking(id);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Response.status(200).entity(Integer.toString(id)).build();
	}
	
	
	
}
