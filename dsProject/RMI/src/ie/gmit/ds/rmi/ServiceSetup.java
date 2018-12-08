package ie.gmit.ds.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.Naming;

public class ServiceSetup {
	public static void main(String[] args) throws Exception {

		//Create an instance of a BookigServiceImpl. As BookigServiceImpl implements the BookingService
		//interface, it can be referred to as a BookingService type.
		BookingService bs = new BookigServiceImpl();

		//Start the RMI registry on port 1099
		LocateRegistry.createRegistry(1099);

		//Bind our remote object to the registry 
		Naming.rebind("carhire", bs);

		//Print a message to standard output
		System.out.println("Server ready.");

	}
}
