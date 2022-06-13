package com.jbk.ticketBookingApp.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.ticketBookingApp.DAO.TicketBookingDAO;
import com.jbk.ticketBookingApp.Entity.Ticket;



@Service
public class TicketBookingService {

	@Autowired
	private TicketBookingDAO ticketBookingDAO;
	public Ticket createTicket(Ticket ticket) {
		
		System.out.println(ticket);
		return ticketBookingDAO.save(ticket);
	}
	
	
	public Ticket getTicketById(Integer ticketid) {
		
		
		return ticketBookingDAO.findById(ticketid).orElse(null);
		
		
		
//		Optional<Ticket> optional=ticketBookingDAO.findById(ticketid);
//		
//		if(optional.isPresent())
//		{
//			return optional.get();
//		}
//		else
//		{
//			return optional.get();
//		}
		
	}


	public Iterable<Ticket> getAllBookedTickets() {
		return ticketBookingDAO.findAll();
	}


	public void deleteTicketById(Integer ticketid) {
		
		
		ticketBookingDAO.deleteById(ticketid);
	}


	public Ticket updateTicket(Integer ticketid, String newEmail) {

		Ticket ticketFromDB=ticketBookingDAO.findById(ticketid).orElse(null);
		
		ticketFromDB.setEmail(newEmail);
		
		Ticket updatedTicket=ticketBookingDAO.save(ticketFromDB);
		return updatedTicket ;
	}
	
	

}
