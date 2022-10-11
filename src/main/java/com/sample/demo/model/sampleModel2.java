package com.sample.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class sampleModel2 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int demo2;
	String value2;
	String value3;
	public int getDemo2() {
		return demo2;
	}
	public void setDemo2(int demo2) {
		this.demo2 = demo2;
	}
	public String getValue2() {
		return value2;
	}
	public void setValue2(String value2) {
		this.value2 = value2;
	}
	public String getValue3() {
		return value3;
	}
	public void setValue3(String value3) {
		this.value3 = value3;
	}
	@Override
	public String toString() {
		return "sampleModel2 [demo2=" + demo2 + ", value2=" + value2 + ", value3=" + value3 + "]";
	}
	public sampleModel2(int demo2, String value2, String value3) {
		super();
		this.demo2 = demo2;
		this.value2 = value2;
		this.value3 = value3;
	}
	public sampleModel2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
