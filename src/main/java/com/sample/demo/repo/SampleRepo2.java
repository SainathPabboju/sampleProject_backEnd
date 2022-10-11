package com.sample.demo.repo;
import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sample.demo.model.sampleModel2;



public interface SampleRepo2 extends JpaRepository<sampleModel2,Integer> {

//	@Query("select value3 from sample.SampleModel2 where value2='a'" )
	List<sampleModel2> findByValue2(String a);

	

}
