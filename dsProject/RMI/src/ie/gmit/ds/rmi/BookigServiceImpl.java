package ie.gmit.ds.rmi;

import java.rmi.RemoteException;
import java.sql.*;
import ie.gmit.ds.model.Booking;
import ie.gmit.ds.model.Customer;

public class BookigServiceImpl implements BookingService {

	// Database connection
	private Connection connection;

	public BookigServiceImpl() {
		connect();
	}

	private void connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/carhire", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public int createBooking(Booking booking) throws RemoteException {
		// TODO Auto-generated method stub

		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement("INSERT INTO Booking VALUES (?,?,?,?,?)");
			stmt.setString(1, booking.getTime());
			stmt.setString(2, booking.getCarid());
			stmt.setInt(3, booking.getCustomerid());
			stmt.setString(4, booking.getBookingfrom());
			stmt.setString(5, booking.getBookingto());
			stmt.executeUpdate();

			final Statement myStmt = connection.createStatement();
			final ResultSet rs = myStmt.executeQuery("SELECT * FROM Booking ORDER BY id DESC LIMIT 1");
			while (rs.next()) {
				if(booking.getTime().equals(rs.getString("time")))
					return rs.getInt("id");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return -1;

	}

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
				if(customer.getFirstname().equals(rs.getString("firstname")) && customer.getLastname().equals(rs.getString("lastname")))
					return rs.getInt("id");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return -1;

	}

}
