package com.jbk.ticketBookingApp.DAO;

import org.springframework.data.repository.CrudRepository;

import com.jbk.ticketBookingApp.Entity.Ticket;




public interface TicketBookingDAO extends CrudRepository<Ticket, Integer> {

}
