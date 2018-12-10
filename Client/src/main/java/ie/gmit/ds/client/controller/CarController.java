package ie.gmit.ds.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ie.gmit.ds.client.model.CarList;
import ie.gmit.ds.client.services.CarService;


public class CarController {
	@Autowired
	CarService carService;

	@RequestMapping(value = "/viewcars", method=RequestMethod.GET)
	public String getCar(Model model) {
		System.out.println("HERE");
		CarList cars = carService.findAll();
		model.addAttribute("car", cars);
			return "viewcars";
	}
	
}