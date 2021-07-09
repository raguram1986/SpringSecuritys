package com.example.studentmanagement.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String stname;
    private String course;
    private int fee;
    
    
    public Student() {
    	
		
	}

    
	public Student(Long id, String stname, String course, int fee) {
	
		this.id = id;
		this.stname = stname;
		this.course = course;
		this.fee = fee;
	}
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}






	@Override
	public String toString() {
		return "Student [id=" + id + ", stname=" + stname + ", course=" + course + ", fee=" + fee + "]";
	}
    
	
    
    
    
    
    
    
    
    
	

}
