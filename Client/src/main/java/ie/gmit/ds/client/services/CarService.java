package ie.gmit.ds.client.services;

import java.util.Collections;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ie.gmit.ds.client.model.CarList;

@Service
public class CarService {
	
	String resourceBaseURL = "http://localhost:8080/rest/webapi/cars";
	
	/**
	 * In findAll method we need to get a new rest template and http headers to set
	 * accept and content type. Then we get response from server. GET http method in
	 * this case gets a car list.
	 */
	public CarList findAll(){
		
		RestTemplate rt = new RestTemplate();
		HttpHeaders http = new HttpHeaders();
		http.setAccept(Collections.singletonList(MediaType.APPLICATION_XML));
        http.setContentType(MediaType.APPLICATION_XML);
        HttpEntity<Object> request = new HttpEntity<>(new CarList(), http);
        ResponseEntity<CarList> response = rt.exchange(resourceBaseURL, HttpMethod.GET, request, CarList.class);
        return response.getBody();
	}
}

