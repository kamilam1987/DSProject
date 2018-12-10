package ie.gmit.ds.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ie.gmit.ds.client.model.Booking;
import ie.gmit.ds.client.services.BookingService;

@Controller
public class BookingController {
	@Autowired
	BookingService bookingService;

	@RequestMapping(value = "/viewbooking", method=RequestMethod.GET)
	public String getBooking(Model model) {
		System.out.println("HERE");
		Booking b = bookingService.find("2");
		model.addAttribute("booking", b);
			return "viewbooking";
	}
	
	@RequestMapping(value = "/addbooking", method=RequestMethod.GET)
	public String addBooking(Model model) {
		System.out.println("HERE");
		Booking b = bookingService.find("2");
		model.addAttribute("booking", b);
			return "viewbooking";
	}
	
}	//	ShipController
