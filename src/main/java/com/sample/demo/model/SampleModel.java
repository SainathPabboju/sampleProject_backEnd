package com.sample.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SampleModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
int demo;
int value1;
String value2;
public int getDemo() {
	return demo;
}
public void setDemo(int demo) {
	this.demo = demo;
}
public int getValue1() {
	return value1;
}
public void setValue1(int value1) {
	this.value1 = value1;
}
public String getValue2() {
	return value2;
}
public void setValue2(String value2) {
	this.value2 = value2;
}
@Override
public String toString() {
	return "SampleModel [demo=" + demo + ", value1=" + value1 + ", value2=" + value2 + "]";
}
public SampleModel(int demo, int value1, String value2) {
	super();
	this.demo = demo;
	this.value1 = value1;
	this.value2 = value2;
}
public SampleModel() {
	super();
	// TODO Auto-generated constructor stub
}



}
