package ie.gmit.ds.client.controller;

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

/**
 * @author Kamila
 *
 */
@Controller
public class BookingController {
	@Autowired
	BookingService bookingService;

	/**
	 * A GET method in this case is used to retrieve booking data from the server
	 * Displays booking with id=2
	 */
	@RequestMapping(value = "/viewbooking", method = RequestMethod.GET)
	public String getBookings(Model model) {
		System.out.println("HERE");
		Booking b = bookingService.find("2");
		model.addAttribute("booking", b);
		return "viewbooking";
	}

	/**
	 * A GET method in this case is used to retrieve a new added booking data from
	 * the server
	 * 
	 */
	@RequestMapping(value = "/addbooking", method = RequestMethod.GET)
	public String add(Model model) {
		System.out.println("HERE");
		Booking b = bookingService.find("2");
		model.addAttribute("booking", b);
		return "addbooking";
	}

	/**
	 * A POST method is used to create a new booking, update or delete data on the
	 * server side
	 * 
	 */
	@RequestMapping(value = "/addbooking", method = RequestMethod.POST)
	public String add(@Valid @ModelAttribute("booking") Booking b, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "addbooking";
		} else {
			bookingService.add(b);
			return "redirect:viewbooking";
		}
	}

}
