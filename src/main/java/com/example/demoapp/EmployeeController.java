package com.example.demoapp;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	ObjectMapper mapper = new ObjectMapper();
	@GetMapping
	public String all() throws Exception{
		return mapper.writeValueAsString(System.getenv());
	}
}
