package ie.gmit.ds.client.services;

import java.util.Collections;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import ie.gmit.ds.client.model.Booking;

/**
 * @author Kamilka
 *
 */
/**
 * BookingService class contains a find method which gets all all bookings, add
 * method which adds booking modify which updates booking and delete method to
 * delete a booking.
 */
@Service
public class BookingService {

	String resourceBaseURL = "http://localhost:8080/rest/webapi/booking/";

	/**
	 * In find method we need to get a new rest template and http headers to set
	 * accept and content type. Then we get response from server. GET http method in this
	 * case gets all bookings.
	 */
	public Booking find(String id) {
		
		RestTemplate rt = new RestTemplate();
		HttpHeaders http = new HttpHeaders();
		http.setAccept(Collections.singletonList(MediaType.APPLICATION_XML));
		http.setContentType(MediaType.APPLICATION_XML);
		HttpEntity<Object> request = new HttpEntity<>(new Booking(), http);
		ResponseEntity<Booking> response = rt.exchange(resourceBaseURL + id, HttpMethod.GET, request,Booking.class);
		return response.getBody();
	}

	/**
	 * In add method we need to get a new rest template and http headers to set
	 * accept and content type. Then we get response from server. POST http method in
	 * this case adds a new booking.
	 */
	public int add(Booking b) {

		RestTemplate rt = new RestTemplate();
		HttpHeaders http = new HttpHeaders();
		http.setAccept(Collections.singletonList(MediaType.APPLICATION_XML));
		http.setContentType(MediaType.APPLICATION_XML);
		HttpEntity<Object> request = new HttpEntity<>(b, http);
		ResponseEntity<Integer> response = rt.exchange(resourceBaseURL, HttpMethod.POST, request, Integer.class);
		return response.getBody();

	}
	/**
	 * In modify method we need to get a new rest template and http headers to set
	 * accept and content type. Then we get response from server. PUT http method in
	 * this case update a booking.
	 */
	public int modify(Booking b) {
		
		RestTemplate rt = new RestTemplate();
		HttpHeaders http = new HttpHeaders();
		http.setAccept(Collections.singletonList(MediaType.APPLICATION_XML));
		http.setContentType(MediaType.APPLICATION_XML);
		HttpEntity<Object> request = new HttpEntity<>(b, http);
		ResponseEntity<Integer> response = rt.exchange(resourceBaseURL, HttpMethod.PUT, request, Integer.class);
		return response.getBody();
	}

	/**
	 * In delete method we need to get a new rest template and http headers to set
	 * accept and content type. Then we get response from server. DELETE http method in
	 * this case deletes a booking.
	 */
	public int delete(int id) {
		
		RestTemplate rt = new RestTemplate();
		HttpHeaders http = new HttpHeaders();
		http.setAccept(Collections.singletonList(MediaType.APPLICATION_XML));
		http.setContentType(MediaType.APPLICATION_XML);
		HttpEntity<Object> request = new HttpEntity<>(new Booking(), http);
		ResponseEntity<Integer> response = rt.exchange(resourceBaseURL + id, HttpMethod.DELETE, request,Integer.class);
		return response.getBody();
	}
}
