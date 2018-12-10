package ie.gmit.ds.client.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ie.gmit.ds.client.model.Booking;
import ie.gmit.ds.client.services.BookingService;

@Controller
public class BookingController {
	@Autowired
	BookingService bookingService;

	@RequestMapping(value = "/viewbooking", method=RequestMethod.GET)
	public String getBookings(Model model) {
		System.out.println("HERE");
		Booking b = bookingService.find("2");
		model.addAttribute("booking", b);
			return "viewbooking";
	}
	
	
	@RequestMapping(value = "/addbooking", method=RequestMethod.GET)
	public String add(Model model) {
		System.out.println("HERE");
		Booking b = bookingService.find("2");
		model.addAttribute("booking", b);
			return "addbooking";
	}
	
	
	@RequestMapping(value = "/addbooking", method = RequestMethod.POST)
	public String add(@Valid @ModelAttribute("booking") Booking b,
			BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "addbooking";
		} else {
			bookingService.add(b);
			return "redirect:viewbooking";
		}
	}
	
}	
