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

@Service
public class BookingService {
	
	String resourceBaseURL = "http://localhost:8080/rest/webapi/booking/";
	
	//cj
	public Booking find(String id){
		//Get new template
        RestTemplate restTemplate = new RestTemplate();
        //Get new headers
        HttpHeaders headers = new HttpHeaders();
        //Set accept type
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_XML));
        //Set content type
        headers.setContentType(MediaType.APPLICATION_XML);
        //Create new request with the new headers
        HttpEntity<Object> request = new HttpEntity<>(new Booking(), headers);

        //Get the response from the server

        ResponseEntity<Booking> responseEntity = restTemplate.exchange(resourceBaseURL + id, HttpMethod.GET, request, Booking.class);
        return responseEntity.getBody();

	}
	
	public int add(Booking b){
		//Get new template
        RestTemplate restTemplate = new RestTemplate();
        //Get new headers
        HttpHeaders headers = new HttpHeaders();
        //Set accept type
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_XML));
        //Set content type
        headers.setContentType(MediaType.APPLICATION_XML);
        //Create new request with the new headers
        HttpEntity<Object> request = new HttpEntity<>(b, headers);

        //Get the response from the server

        ResponseEntity<Integer> responseEntity = restTemplate.exchange(resourceBaseURL, HttpMethod.POST, request, Integer.class);
        return responseEntity.getBody();

	}
	
	public int modify(Booking b){
		//Get new template
        RestTemplate restTemplate = new RestTemplate();
        //Get new headers
        HttpHeaders headers = new HttpHeaders();
        //Set accept type
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_XML));
        //Set content type
        headers.setContentType(MediaType.APPLICATION_XML);
        //Create new request with the new headers
        HttpEntity<Object> request = new HttpEntity<>(b, headers);

        //Get the response from the server

        ResponseEntity<Integer> responseEntity = restTemplate.exchange(resourceBaseURL, HttpMethod.PUT, request, Integer.class);
        return responseEntity.getBody();

	}
	
	public int delete(int id){
		//Get new template
        RestTemplate restTemplate = new RestTemplate();
        //Get new headers
        HttpHeaders headers = new HttpHeaders();
        //Set accept type
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_XML));
        //Set content type
        headers.setContentType(MediaType.APPLICATION_XML);
        //Create new request with the new headers
        HttpEntity<Object> request = new HttpEntity<>(new Booking(), headers);

        //Get the response from the server

        ResponseEntity<Integer> responseEntity = restTemplate.exchange(resourceBaseURL+id, HttpMethod.DELETE, request, Integer.class);
        return responseEntity.getBody();

	}

}

