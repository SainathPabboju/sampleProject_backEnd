package com.sample.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sample.demo.model.SampleModel;
import com.sample.demo.model.sampleModel2;
import com.sample.demo.service.SampleService;

import java.util.*;

@RestController
@CrossOrigin(value="*")
public class SampleController {
	
	@Autowired
	SampleService service;
	
	@GetMapping("/")
	public List<SampleModel> hello(@RequestParam int a) {
		return service.populate(a);
		
		
		
	}
	@GetMapping("/new")
	public List<sampleModel2> populate2(@RequestParam String a) {
		
		return service.populate2(a);
//		return new ArrayList<>(Arrays.asList("Hi", "Bro"));

	}
	
}
