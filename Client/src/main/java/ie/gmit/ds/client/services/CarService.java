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
	
	public CarList findAll(){
		//Get new template
        RestTemplate restTemplate = new RestTemplate();
        //Get new headers
        HttpHeaders headers = new HttpHeaders();
        //Set accept type
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_XML));
        //Set content type
        headers.setContentType(MediaType.APPLICATION_XML);
        //Create new request with the new headers
        HttpEntity<Object> request = new HttpEntity<>(new CarList(), headers);

        //Get the response from the server

        ResponseEntity<CarList> responseEntity = restTemplate.exchange(resourceBaseURL, HttpMethod.GET, request, CarList.class);
        return responseEntity.getBody();

	}

}

