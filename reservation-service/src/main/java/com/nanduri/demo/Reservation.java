package com.nanduri.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

/**
 * @author ramnanduri
 *
 */
@Entity
public class Reservation {

	@javax.persistence.Id
	@GeneratedValue
	private Long Id;
	private String reservationName;	
	
	Reservation(){
		//Dummy Constructor
	}
	
	public Reservation(String reservationName) {
		super();
		this.reservationName = reservationName;
	}
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getReservationName() {
		return reservationName;
	}
	public void setReservationName(String reservationName) {
		this.reservationName = reservationName;
	}

	@Override
	public String toString() {
		return "Reservation [Id=" + Id + ", reservationName=" + reservationName + "]";
	}


	
}
