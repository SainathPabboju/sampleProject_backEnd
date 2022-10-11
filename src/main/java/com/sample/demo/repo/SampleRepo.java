package com.sample.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.demo.model.SampleModel;



import java.util.*;

public interface SampleRepo extends JpaRepository<SampleModel, Integer> {

	List<SampleModel> findByValue1(int a);

}
