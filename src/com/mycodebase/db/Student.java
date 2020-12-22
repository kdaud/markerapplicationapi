package com.mycodebase.db;

import java.io.Serializable;

public class Student implements Serializable {
	
	private String name;
	
	private String course;
	
	private double cpa;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the course
	 */
	public String getCourse() {
		return course;
	}
	
	/**
	 * @param course the course to set
	 */
	public void setCourse(String course) {
		this.course = course;
	}
	
	/**
	 * @return the cpa
	 */
	public double getCpa() {
		return cpa;
	}
	
	/**
	 * @param cpa the cpa to set
	 */
	public void setCpa(double cpa) {
		this.cpa = cpa;
	}
	
}
