package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
	
	@GetMapping(value = "/test")
	public @ResponseBody ResponseEntity<String> creategetMethod(){
		String message = "Hello Sneha";
		return new ResponseEntity<>(message,HttpStatus.OK);
				}


}
