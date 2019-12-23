package com.company.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity   
@Table(name="Employee_information")              
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	@Column(name="name")
	String name;
	@Column(name="designation")
	String designation;
	@Column(name="rollno")
	int rollno;
	@Column(name="date")
	Date date;
	
	public Employee() {
		super();
	}
	public Employee(String name, String designation, int rollno, Date date) {
		super();
		this.name = name;
		this.designation = designation;
		this.rollno = rollno;
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", rollno=" + rollno
				+ ", date=" + date + "]";
	}
	
	
}
