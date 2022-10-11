package com.sample.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.sample.demo.model.SampleModel;
import com.sample.demo.model.sampleModel2;
import com.sample.demo.repo.SampleRepo;
import com.sample.demo.repo.SampleRepo2;


@Service
public class SampleService {
	
	@Autowired
	SampleRepo repo;
	
	@Autowired
	SampleRepo2 repo2;
	public List<SampleModel> populate(int a) {
		
return repo.findByValue1(a);
		
	}
	public List<sampleModel2> populate2(String a) {
		
		List<sampleModel2> data= repo2.findByValue2(a);
		return data;
		
	}

}
