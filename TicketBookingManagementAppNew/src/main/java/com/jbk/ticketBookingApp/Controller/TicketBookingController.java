package com.jbk.ticketBookingApp.Controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.ticketBookingApp.Entity.Ticket;
import com.jbk.ticketBookingApp.Service.TicketBookingService;



@RestController
@RequestMapping("api/tickets")
public class TicketBookingController {
	
	@Autowired
	private TicketBookingService ticketbookingService;
	
	
	@PostMapping("create")
	public Ticket createTicket(@RequestBody Ticket ticket)
	{
		return ticketbookingService.createTicket(ticket);
	}
	
	@GetMapping("retrievebyid/{ticketid}")
	public Ticket getTicketById(@PathVariable("ticketid")Integer ticketid)
	{
		return ticketbookingService.getTicketById(ticketid); 
	}
	
	@GetMapping("allTickets")
	public Iterable<Ticket> getAllBookedTickets()
	{
		return ticketbookingService.getAllBookedTickets();
	}
 	
	@DeleteMapping("delete/{ticketid}")
	public void deleteTicketById(@PathVariable Integer ticketid)
	{
		ticketbookingService.deleteTicketById(ticketid);
	}
	@PutMapping("updateTicket/{ticketid}/{newEmail:.+}")
	public Ticket updateTicket(@PathVariable("ticketid")Integer ticketid,@PathVariable("newEmail")String newEmail)
	{
		return ticketbookingService.updateTicket(ticketid,newEmail);
	}

}
