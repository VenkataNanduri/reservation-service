package com.nanduri.demo;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ch.qos.logback.core.net.SyslogOutputStream;

@Component
public class DummyCLR implements CommandLineRunner {

	
	private final ReservationRepository reservationRepository;
	
	
	@Autowired
	public DummyCLR(ReservationRepository reservationRepository) {
		super();
		this.reservationRepository = reservationRepository;
	}



	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		Stream.of("Srirama","Lakshmana","Janaki","Hanuman","Bharatha","Shatrughna")
			.forEach(n->reservationRepository.save(new Reservation(n)));
		
		reservationRepository.findAll().forEach(System.out::println);
	}

}
