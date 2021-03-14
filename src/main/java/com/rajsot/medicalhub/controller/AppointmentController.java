package com.rajsot.medicalhub.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/appointment")
public class AppointmentController {
	
	@GetMapping
	public ResponseEntity<String> getAppointments(){
		return new ResponseEntity<String>("<h2>Success</h2>",HttpStatus.OK);
	}
	
}
