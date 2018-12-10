package ie.gmit.ds.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import ie.gmit.ds.model.Booking;
import ie.gmit.ds.model.Car;
import ie.gmit.ds.model.CarList;
import ie.gmit.ds.model.Customer;
import java.sql.SQLException;

public class BookigServiceImpl extends UnicastRemoteObject implements BookingService {

	/**
	 * Declare variabes needed to
	 * set up connection with database
	 */
	private static final long serialVersionUID = 1L;
	private Connection connection;

	public BookigServiceImpl() throws RemoteException {
		connect();
	}
	/**
	 * Sets up connection with database.
	 * Gets connection on port 3306 without password 
	 */
	private void connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/carhire", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method creates a a new booking.
	 * The following SQL statement inserts a new record in the "Booking" tables
	 */
	@Override
	public int createBooking(Booking booking) throws RemoteException {
		// TODO Auto-generated method stub

		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(
					"INSERT INTO Booking (time,carid,customerid,bookingfrom,bookingto)VALUES (?,?,?,?,?)");
			stmt.setString(1, booking.getTime());
			stmt.setString(2, booking.getCar().getId());
			stmt.setInt(3, booking.getCustomer().getId());
			stmt.setString(4, booking.getBookingfrom());
			stmt.setString(5, booking.getBookingto());
			stmt.executeUpdate();

			final Statement myStmt = connection.createStatement();
			final ResultSet rs = myStmt.executeQuery("SELECT * FROM Booking ORDER BY id DESC LIMIT 1");
			while (rs.next()) {
				if (booking.getTime().equals(rs.getString("time")))
					return rs.getInt("id");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return -1;

	}

	/**
	 * This method creates a a new customer.
	 * The following SQL statement inserts a new record in the "Customer" tables
	 */
	@Override
	public int createCustomer(Customer customer) throws RemoteException {
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement("INSERT INTO Customer VALUES (?,?)");

			stmt.setString(1, customer.getFirstname());
			stmt.setString(2, customer.getLastname());
			stmt.executeUpdate();

			final Statement myStmt = connection.createStatement();
			final ResultSet rs = myStmt.executeQuery("SELECT * FROM Customer ORDER BY id DESC LIMIT 1");
			while (rs.next()) {
				if (customer.getFirstname().equals(rs.getString("firstname"))
						&& customer.getLastname().equals(rs.getString("lastname")))
					return rs.getInt("id");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return -1;

	}

	/**
	 * This method gets a booking list.
	 * 
	 */
	@Override
	public List<Booking> getBookings() throws RemoteException {
		try {
			final Statement myStmt = connection.createStatement();
			final ResultSet rs = myStmt
					.executeQuery("SELECT * FROM Booking, Car, Customer WHERE carid=car.id AND customerid=customer.id");
			final List<Booking> bookings = new ArrayList<>();

			while (rs.next()) {
				Car car = new Car();
				car.setId(rs.getString("Car.id"));
				car.setMake(rs.getString("make"));
				car.setModel(rs.getString("model"));

				Customer customer = new Customer();
				customer.setId(rs.getInt("Customer.id"));
				customer.setFirstname(rs.getString("firstname"));
				customer.setLastname(rs.getString("lastname"));

				Booking booking = new Booking();
				booking.setId(rs.getInt("id"));
				booking.setTime(rs.getString("time"));
				booking.setCar(car);
				booking.setCustomer(customer);
				booking.setBookingfrom(rs.getString("bookingfrom"));
				booking.setBookingto(rs.getString("bookingto"));

				bookings.add(booking);
			}
			return bookings;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * This method updates a a Booking table.
	 * The following SQL updates time car id, customer id and booking date
	 */
	@Override
	public int updateBooking(Booking booking) throws RemoteException {
		PreparedStatement stmt;
		try {

			stmt = connection.prepareStatement(
					"UPDATE Booking set time = ?,carid = ?,customerid = ?,bookingfrom = ?,bookingto= ? where id=? limit 1");
			stmt.setString(1, booking.getTime());
			stmt.setString(2, booking.getCar().getId());
			stmt.setInt(3, booking.getCustomer().getId());
			stmt.setString(4, booking.getBookingfrom());
			stmt.setString(5, booking.getBookingto());
			stmt.setInt(6, booking.getId());
			return stmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public Booking getBooking(int id) throws RemoteException {

		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(
					"SELECT * FROM Booking, Car, Customer WHERE carid=car.id AND customerid=customer.id AND booking.id=? LIMIT 1 ");

			stmt.setInt(1, id);
			final ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Car car = new Car();
				car.setId(rs.getString("Car.id"));
				car.setMake(rs.getString("make"));
				car.setModel(rs.getString("model"));

				Customer customer = new Customer();
				customer.setId(rs.getInt("Customer.id"));
				customer.setFirstname(rs.getString("firstname"));
				customer.setLastname(rs.getString("lastname"));

				Booking booking = new Booking();
				booking.setId(rs.getInt("id"));
				booking.setTime(rs.getString("time"));
				booking.setCar(car);
				booking.setCustomer(customer);
				booking.setBookingfrom(rs.getString("bookingfrom"));
				booking.setBookingto(rs.getString("bookingto"));

				return booking;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * This method gets a car list.
	 * 
	 */
	@Override
	public CarList getCars() throws RemoteException {
	    CarList carlist= new CarList();
	    List<Car> list = new ArrayList<>();
		try {
			final Statement myStmt = connection.createStatement();
			final ResultSet rs = myStmt
					.executeQuery("SELECT * FROM Car");

			while (rs.next()) {
				Car car = new Car();
				car.setId(rs.getString("id"));
				car.setMake(rs.getString("make"));
				car.setModel(rs.getString("model"));

				list.add(car);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		carlist.setCar(list);
		
		return carlist;
	}

	/**
	 * This method delete from Booking table.
	 * The following SQL deletes from booking table by id
	 */
	@Override
	public int deleteBooking(int id) throws RemoteException {
		PreparedStatement stmt;
		try {

			stmt = connection.prepareStatement(
					"DELETE FROM Booking where id=?");
			
			stmt.setInt(1, id);
			return stmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 1;
	}
	
	
}
