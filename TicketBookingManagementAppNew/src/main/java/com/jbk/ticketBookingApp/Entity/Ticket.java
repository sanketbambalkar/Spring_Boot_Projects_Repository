package com.jbk.ticketBookingApp.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ticket")
public class Ticket {

	
	
	@Id
	@Column(name = "ticket_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer ticket_id;

	@Column(name = "passenger_name", nullable = false)
	private String passengerName;

	@Column(name = "booking_date")
	private Date bookingDate;

	@Column(name = "source_station")
	private String sourceStation;

	@Column(name = "dest_station")
	private String deststation;

	@Column(name = "email")
	private String email;

//	public Ticket() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	
//	
//
//	public Ticket(Integer ticket_id, String passengerName, Date bookingDate, String sourceStation, String deststation,
//			String email) {
//		super();
//		this.ticket_id = ticket_id;
//		this.passengerName = passengerName;
//		this.bookingDate = bookingDate;
//		this.sourceStation = sourceStation;
//		this.deststation = deststation;
//		this.email = email;
//	}

	public Integer getTicket_id() {
		return ticket_id;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public String getSourceStation() {
		return sourceStation;
	}

	public String getDeststation() {
		return deststation;
	}

	public String getEmail() {
		return email;
	}


	public void setTicket_id(Integer ticket_id) {
		this.ticket_id = ticket_id;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}

	public void setDeststation(String deststation) {
		this.deststation = deststation;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Ticket [ticket_id=" + ticket_id + ", passengerName=" + passengerName + ", bookingDate=" + bookingDate
				+ ", sourceStation=" + sourceStation + ", deststation=" + deststation + ", email=" + email + "]";
	}

}
