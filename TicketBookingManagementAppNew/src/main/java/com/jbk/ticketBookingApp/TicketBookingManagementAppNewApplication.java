package com.jbk.ticketBookingApp;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.jbk.ticketBookingApp.Entity.Ticket;
import com.jbk.ticketBookingApp.Service.TicketBookingService;


@SpringBootApplication
@ComponentScan("com.jbk.ticketBookingApp")
public class TicketBookingManagementAppNewApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext=SpringApplication.run(TicketBookingManagementAppNewApplication.class, args);
		
		TicketBookingService ticketBookingService=applicationContext.getBean("ticketBookingService",TicketBookingService.class);
	
		
		Ticket ticket=new Ticket();
		
		
		
		ticket.setBookingDate(new Date());
		ticket.setDeststation("Pune");
		ticket.setEmail("abc@gmail.com");
		ticket.setPassengerName("ABC");
		ticket.setSourceStation("Amravati");
		
		ticketBookingService.createTicket(ticket);
		System.out.println(ticket);
		
	
	}

}
